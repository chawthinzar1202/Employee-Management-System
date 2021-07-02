package jp.co.cybermissions.itspj.java.employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.cybermissions.itspj.java.employee.model.Employee;
import jp.co.cybermissions.itspj.java.employee.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);

    List<Employee> findTopByOrderByIdDesc();



}
