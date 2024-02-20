package com.nb.ex.hbn.hibernatedemo.db.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long companyId;
	private String companyName;
	private String companyIsin;
	private String companySymbol;
	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private List<Department> departments;
}
