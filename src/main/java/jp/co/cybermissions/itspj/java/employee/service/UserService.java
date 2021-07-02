package jp.co.cybermissions.itspj.java.employee.service;


import org.springframework.security.core.userdetails.UserDetailsService;

import jp.co.cybermissions.itspj.java.employee.dto.UserRegistrationDto;
import jp.co.cybermissions.itspj.java.employee.model.User;

public interface UserService extends UserDetailsService {
    
    User save(UserRegistrationDto registrationDto);
    
}
