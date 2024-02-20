package com.nb.ex.hbn.hibernatedemo.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nb.ex.hbn.hibernatedemo.db.entity.Company;

public interface CompanyRepository extends JpaRepository<Company, Integer> {

}
