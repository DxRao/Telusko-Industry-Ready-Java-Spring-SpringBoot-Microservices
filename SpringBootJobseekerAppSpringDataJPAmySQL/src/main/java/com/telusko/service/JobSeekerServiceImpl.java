package com.telusko.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.bo.JobSeeker;
import com.telusko.dao.IJobSeekerDao;

@Service
public class JobSeekerServiceImpl implements IJobSeekerService {

	@Autowired
	private IJobSeekerDao repo;
	
	@Override
	public String registerJobSeeker(JobSeeker seeker) {
		
		 Integer id=repo.save(seeker).getId();
		 return "Job seeker details registered with id "+ id;
	}

	@Override
	public Optional<JobSeeker> getDetailsById(Integer id) {
		
		Optional<JobSeeker> optional = repo.findById(id);
		
		return optional;
	}

}
