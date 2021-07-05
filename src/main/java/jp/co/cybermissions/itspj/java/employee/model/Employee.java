package jp.co.cybermissions.itspj.java.employee.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
	
	private String firstName;
	
	private String lastName;
	
	private String gender;
	
	private String department;
	
	private String email;

    private String phone;

	private Date dateOfBirth;

	private String address;
	
	
	
}
