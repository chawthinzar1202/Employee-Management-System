package jp.co.cybermissions.itspj.java.employee.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
   
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;  
	
	@NotBlank
	private String firstName;
	
	@NotBlank
	private String lastName;
	
	@NotBlank
	private String gender;
	
	@NotBlank
	private String department;
	
	@NotBlank
    @Email
	private String email;

	@NotBlank
    private String phone;

	// @NotBlank
	private Date dateOfBirth;

	@NotBlank
	private String address;
	
	
	
}
