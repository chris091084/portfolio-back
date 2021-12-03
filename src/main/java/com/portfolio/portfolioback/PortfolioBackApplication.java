package com.portfolio.portfolioback;

import com.portfolio.portfolioback.Dao.UserRepository;
import com.portfolio.portfolioback.Model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication

@EnableSwagger2
public class PortfolioBackApplication {

	public UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(PortfolioBackApplication.class, args);
	}


}


