package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.JobSeekerInfo;
import com.nt.repository.IJobSeekerInfoRepository;

@Service("jsService")
public class JobSeekerMgmtServiceImpl implements IJobSeekerMgmtService {
	@Autowired
	private   IJobSeekerInfoRepository  jsRepo;

	@Override
	public String registerJobSeeker(JobSeekerInfo info) {
	
		return  " Job seeker is saved  with id value::"+jsRepo.save(info).getJsId();
	}

}
