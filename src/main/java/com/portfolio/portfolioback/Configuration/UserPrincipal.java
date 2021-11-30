package com.portfolio.portfolioback.Configuration;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.portfolio.portfolioback.Model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class UserPrincipal implements UserDetails {
    /** serial version UID. */
    private static final long serialVersionUID = 1L;

    private Long id;

    /** User first name. */
    private String userName;

    private String email;

    @JsonIgnore
    private String password;

    private boolean active;

    private List<GrantedAuthority> authorities;

    public UserPrincipal(User user){
        this.id = user.getId();

        this.password = user.getPassword();
        this.email = user.getEmail();
        this.userName = email;
        this.authorities = Arrays.stream(user.getRole().split(","))
                .map(SimpleGrantedAuthority::new)
                .collect(Collectors.toList());
    }


    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }



    public long getId() {
        return id;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return active;
    }

}