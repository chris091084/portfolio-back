package com.portfolio.portfolioback.Dao;


import com.portfolio.portfolioback.Model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{

    User findByEmail(String email);

}