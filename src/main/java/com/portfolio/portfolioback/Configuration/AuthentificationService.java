package com.portfolio.portfolioback.Configuration;

import com.portfolio.portfolioback.Dao.UserRepository;
import com.portfolio.portfolioback.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

    @Service
    public class AuthentificationService implements UserDetailsService {
        @Autowired
        private UserRepository userRepository;


        @Override
        public UserDetails loadUserByUsername(String email)
                throws UsernameNotFoundException {

            // user email is used as username.
            User userInfo = userRepository.findByEmail(email);
            if(userInfo == null) {
                new UsernameNotFoundException("User Not Found with -> username or email : " + email);
            };

            return new UserPrincipal(userInfo);
        }
    }

