package com.portfolio.portfolioback.Controller;
import com.portfolio.portfolioback.Dao.UserRepository;
import com.portfolio.portfolioback.Model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
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
	User userToSave = null;
	userToSave = user;
	userRepository.save(userToSave);
return userToSave;
}

}
