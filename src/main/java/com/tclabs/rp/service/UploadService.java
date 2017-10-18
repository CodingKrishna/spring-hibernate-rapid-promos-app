package com.tclabs.rp.service;

import java.util.List;

import com.tclabs.rp.dto.CandidateDto;

public interface UploadService {

	void insertCandidateList(List<CandidateDto> listCandidates);

}
