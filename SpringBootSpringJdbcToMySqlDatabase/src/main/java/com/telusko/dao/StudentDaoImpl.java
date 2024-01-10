package com.telusko.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class StudentDaoImpl implements IStudentDao 
{
	private static final String SELECT_QUERY = "SELECT SID, SNAME, SCITY FROM studenttable WHERE "
			+ "sid=? ";
	private static final String SELECT_QUERY2 = "SELECT SID, SNAME, SCITY FROM studenttable";
	@Autowired
	private JdbcTemplate jdbc;
	
//	private static class RowMapperImp implements RowMapper<StudentTableBo>
//	{
//
//		@Override
//		public StudentTableBo mapRow(ResultSet rs, int rowNum) throws SQLException {
//		
//			return null;
//		}
//		
//	}
	
	@Override
	public StudentTableBo getStudentById(int id) 
	{
//		jdbc.queryForObject(SELECT_QUERY, new RowMapper<StudentTableBo>() {
//
//			@Override
//			public StudentTableBo mapRow(ResultSet rs, int rowNum) throws SQLException {
//				StudentTableBo bo=new StudentTableBo();
////				int id=rs.getInt(1);
////				bo.setSid(id);
//				bo.setSid(rs.getInt(1));
//				bo.setSname(rs.getString("SNAME"));
//				bo.setScity(rs.getString("SCITY"));
//				return bo;
//			}
//			
//		}, id);
//		return null;
		
		
		return jdbc.queryForObject(SELECT_QUERY, (rs, rowNum) ->{
				StudentTableBo bo=new StudentTableBo();
//				int id=rs.getInt(1);
//				bo.setSid(id);
				bo.setSid(rs.getInt(1));
				bo.setSname(rs.getString("SNAME"));
				bo.setScity(rs.getString("SCITY"));
				return bo;
			}
			
		, id);
		
	}
	
	
	@Override
	public List<StudentTableBo> getStudents() 
	{

		
		
		return jdbc.query(SELECT_QUERY2, (rs, rowNum) ->{
				StudentTableBo bo=new StudentTableBo();

				bo.setSid(rs.getInt(1));
				bo.setSname(rs.getString("SNAME"));
				bo.setScity(rs.getString("SCITY"));
				return bo;
			}
			
		);
		
	}

}
