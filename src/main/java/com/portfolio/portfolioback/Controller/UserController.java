package com.portfolio.portfolioback.Controller;
import com.portfolio.portfolioback.Dao.UserRepository;
import com.portfolio.portfolioback.Model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/")
class UserController{

	@Autowired
	private UserRepository userRepository;

	
	@PostMapping("/newUser")
public User newUser(@RequestBody final User user, final BindingResult bindingResult) {
	User userToSave = null;

	bindingResult.hasErrors();

	userToSave = user;
	userRepository.save(userToSave);


return userToSave;
}

}