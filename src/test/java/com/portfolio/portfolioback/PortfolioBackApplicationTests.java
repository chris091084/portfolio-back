package com.portfolio.portfolioback;

import com.portfolio.portfolioback.Controller.UserController;
import com.portfolio.portfolioback.Model.User;
import org.hibernate.cache.spi.AbstractCacheTransactionSynchronization;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.validation.BindingResult;

import static org.aspectj.bridge.MessageUtil.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PortfolioBackApplicationTests {

	UserController userController;
	BindingResult bindingResult;

	@Test
	void testAddNewUser() {
		// ARRANGE
		int a = 4;
		int b = 3;
		User user = new User();

		// ACT

		userController.newUser(user, bindingResult);

		// ASSERT
		assertEquals(5,somme);

	}


}
