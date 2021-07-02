package jp.co.cybermissions.itspj.java.employee.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.cybermissions.itspj.java.employee.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    
}
