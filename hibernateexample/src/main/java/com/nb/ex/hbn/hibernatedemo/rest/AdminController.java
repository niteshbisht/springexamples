package com.nb.ex.hbn.hibernatedemo.rest;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nb.ex.hbn.hibernatedemo.pojo.dto.CompanyVO;
import com.nb.ex.hbn.hibernatedemo.services.AdminDataService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/admin")
@RequiredArgsConstructor
public class AdminController {
	
	private final AdminDataService adminDataService;
	
	@PostMapping("/company")
	public ResponseEntity<CompanyVO> createCompany(@RequestBody CompanyVO companyVO) {
		CompanyVO companyVO2 = adminDataService.companyVO(companyVO);
		return ResponseEntity.created(URI.create(
				"/company/".concat(companyVO2.getCompanyId().toString()))).body(companyVO2);
	}
	
	
}
