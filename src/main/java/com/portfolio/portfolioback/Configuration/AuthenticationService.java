package com.portfolio.portfolioback.Configuration;

import com.portfolio.portfolioback.Dao.UserRepository;
import com.portfolio.portfolioback.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;



    public UserDetails loadUserByUsername(String userName)
            throws UsernameNotFoundException {

        // user email is used as username.
        User userInfo = userRepository.findByEmail(userName);
        if(userInfo == null) {
                        new UsernameNotFoundException("User Not Found with -> username or email : " + userName);

        }

        return new UserPrincipal(userInfo);
    }
}
