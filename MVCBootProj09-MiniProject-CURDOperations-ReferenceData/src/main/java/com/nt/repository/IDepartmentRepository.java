//IDepartmentRepository.java
package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nt.model.Department;

public interface IDepartmentRepository extends CrudRepository<Department, Integer> {
	      @Query("select deptno from Department")
           public List<Integer>  getAllDeptNo();
       }
