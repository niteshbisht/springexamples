package com.nb.ex.hbn.hibernatedemo.services;

import org.springframework.stereotype.Service;

import com.nb.ex.hbn.hibernatedemo.db.entity.Company;
import com.nb.ex.hbn.hibernatedemo.db.repo.CompanyRepository;
import com.nb.ex.hbn.hibernatedemo.mapper.CompanyMapper;
import com.nb.ex.hbn.hibernatedemo.pojo.dto.CompanyVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminDataService {

	private final CompanyRepository companyRepository;
//	private final CompanyMapper companyMapper;
	
	
	public CompanyVO companyVO(CompanyVO companyVO) {
		CompanyMapper companyMapper = CompanyMapper.INSTANCE;
		Company companyObject = companyMapper.companyVoToCompany(companyVO);
		Company companySaved = companyRepository.save(companyObject);
		return companyMapper.companyToCompanyVO(companySaved);
	}
}
