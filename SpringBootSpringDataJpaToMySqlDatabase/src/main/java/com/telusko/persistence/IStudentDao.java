package com.telusko.persistence;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentDao extends CrudRepository<StudentTable, Serializable>
{

}
