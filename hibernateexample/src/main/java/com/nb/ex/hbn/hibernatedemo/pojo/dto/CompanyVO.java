package com.nb.ex.hbn.hibernatedemo.pojo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyVO {
	private Long companyId;
	private String companyName;
	private String companyIsin;
	private String companySymbol;
}
