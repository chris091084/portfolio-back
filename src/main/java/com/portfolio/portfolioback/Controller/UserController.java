package com.portfolio.portfolioback.Controller;
import com.portfolio.portfolioback.Dao.UserRepository;
import com.portfolio.portfolioback.Model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@RestController
@CrossOrigin
@RequestMapping("/")
class UserController{

	@Autowired
	private UserRepository userRepository;


	@PostMapping("/newUser")
public User newUser(@RequestBody @Valid final User user, final BindingResult bindingResult) {

		if(bindingResult.hasErrors()){
			bindingResult.getFieldErrors();
			String fieldName = "";
			for ( FieldError field: bindingResult.getFieldErrors()
				 ) {
				fieldName = fieldName.concat(field.getField())+ " ";
			}
			String message = " the field "+fieldName+ " is missing ";
			throw new RuntimeException(message);
		}
			User userToSave = null;
			userToSave = user;
			userRepository.save(userToSave);
			return userToSave;
}

}
