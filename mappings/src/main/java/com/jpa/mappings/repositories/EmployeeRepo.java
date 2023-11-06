package com.jpa.mappings.repositories;

import com.jpa.mappings.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
}
