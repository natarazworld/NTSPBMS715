//IEmployeeRepository.java
package com.nt.repository;
import org.springframework.data.repository.PagingAndSortingRepository;
import com.nt.model.Employee;

public interface IEmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

}
