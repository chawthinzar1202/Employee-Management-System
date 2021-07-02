package jp.co.cybermissions.itspj.java.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegistrationDto {

   
    private String firstName;

    private String lastName;

    private String email;
    private String password;
}
