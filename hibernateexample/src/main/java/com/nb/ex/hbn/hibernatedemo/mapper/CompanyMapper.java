package com.nb.ex.hbn.hibernatedemo.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.nb.ex.hbn.hibernatedemo.db.entity.Company;
import com.nb.ex.hbn.hibernatedemo.pojo.dto.CompanyVO;

@Mapper
public interface CompanyMapper {

	CompanyMapper INSTANCE = Mappers.getMapper( CompanyMapper.class ); 
	
	
//	@Mapping(target = "companyName", source = "companyName")
    Company companyVoToCompany(CompanyVO companyVO); 
    
//	@Mapping(target = "companyName", source = "companyName")
	CompanyVO companyToCompanyVO(Company company);
}
