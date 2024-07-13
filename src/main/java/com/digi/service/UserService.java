package com.digi.service;

import com.digi.dto.UserRequest;
import com.digi.model.User;

import java.util.List;

public interface UserService {
    List<User> getAll();
    User getById(int id);
    List<User> getByName(String name,String surname);
    User save(UserRequest userRequest);
}
