package com.thumbtack.presentation_vouting_service.service;

import com.thumbtack.presentation_vouting_service.model.user.User;

import java.util.ArrayList;

public interface UserService{

    ArrayList listAll();

    User getById(String id);

    User saveOrUpdate(User employee);

    void delete(String id);

    boolean exist(String id);
}
