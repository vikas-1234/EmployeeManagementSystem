package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import com.example.demo.domain.Employee;

@Repository
public class EmpRepo extends JpaRepository<Employee, Integer> {

}
