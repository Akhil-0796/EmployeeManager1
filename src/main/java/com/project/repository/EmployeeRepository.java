package com.project.repository;


import com.project.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {



    @Query("SELECT e FROM Employee e WHERE e.position=:position ")
    Page<Employee> findAllByPosition(@Param("position") String position, Pageable pageable);
}
