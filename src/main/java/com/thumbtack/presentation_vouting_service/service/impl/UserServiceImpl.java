package com.thumbtack.presentation_vouting_service.service.impl;

import com.thumbtack.presentation_vouting_service.model.user.User;
import com.thumbtack.presentation_vouting_service.repos.UserRepo;
import com.thumbtack.presentation_vouting_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;

public class UserServiceImpl implements UserService, UserDetailsService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public ArrayList listAll() {
        return null;
    }

    @Override
    public User getById(String id) {
        return null;
    }

    @Override
    public User saveOrUpdate(User employee) {
        return null;
    }

    @Override
    public void delete(String id) {
    }

    @Override
    public boolean exist(String id) {
        return false;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username);
    }
}
