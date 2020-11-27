package com.madhu.bootmvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madhu.bootmvc.model.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer> {

}
