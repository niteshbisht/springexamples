package com.nb.ex.hbn.hibernatedemo.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nb.ex.hbn.hibernatedemo.db.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
