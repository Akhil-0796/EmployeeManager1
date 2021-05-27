package com.project.service;




import com.project.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee save(Employee employee);

    Employee getEmployeeById(Long id);

     void deleteEmployeeById(Long id);

    Page<Employee> findPaginated(int pageNo, int pageSize, String sortField, String sortDir);


    Page<Employee> findPaginatedFiltered(String filter, int pageNo, int pageSize, String sortField, String sortDir);
}
