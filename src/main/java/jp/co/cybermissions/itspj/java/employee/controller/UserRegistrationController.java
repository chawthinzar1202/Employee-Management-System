package jp.co.cybermissions.itspj.java.employee.controller;



import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.cybermissions.itspj.java.employee.dto.UserRegistrationDto;
import jp.co.cybermissions.itspj.java.employee.service.UserService;


@Controller


@RequestMapping("/registration")
public class UserRegistrationController {

    private final UserService userService;

    public UserRegistrationController(UserService userService) {
        super();
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserRegistrationDto userRegistrationDto() {
        return new UserRegistrationDto();
    }

    @GetMapping("")
    public String showRegistrationForm(@ModelAttribute("user") UserRegistrationDto registrationDto) {
        return "registration";
    }

    @PostMapping("")
    public String registerUserAccount(@Validated @ModelAttribute("user") UserRegistrationDto registrationDto, BindingResult result) {
        if(result.hasErrors()) {
            
            return "registration";
        }
        userService.save(registrationDto);
        return "redirect:/registration?success";
    } 

    
}
