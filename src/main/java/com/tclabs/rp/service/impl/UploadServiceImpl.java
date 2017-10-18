package com.tclabs.rp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.tclabs.rp.dao.UploadDao;
import com.tclabs.rp.dto.CandidateDto;
import com.tclabs.rp.model.CandidateEntity;
import com.tclabs.rp.service.UploadService;

@Service("uploadServiceImpl")
public class UploadServiceImpl implements UploadService{
	@Autowired
	@Qualifier("uploadDaoImpl")
	UploadDao uploadDao;

	@Override
	public void insertCandidateList(List<CandidateDto> listCandidates) {
		// TODO Auto-generated method stub
		CandidateEntity candidateEntity = new CandidateEntity();
		for(int i = 0; i<listCandidates.size(); i++) {
			
			CandidateDto candidateDto = listCandidates.get(i);
			candidateEntity.setName(candidateDto.getCandiadte());
			candidateEntity.setMobile(candidateDto.getMobile());
			candidateEntity.setEmail(candidateDto.getEmail());
			candidateEntity.setLocation(candidateDto.getLocation());
			
			uploadDao.insertCandidate(candidateEntity);
		}
	}
	
	
	
}
