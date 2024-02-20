package com.nb.ex.hbn.hibernatedemo.db.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nb.ex.hbn.hibernatedemo.db.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
