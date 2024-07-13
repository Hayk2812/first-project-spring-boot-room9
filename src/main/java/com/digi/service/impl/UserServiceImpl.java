package com.digi.service.impl;

import com.digi.dto.UserRequest;
import com.digi.enams.Status;
import com.digi.model.User;
import com.digi.repository.UserRepository;
import com.digi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User getById(int id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }

    @Override
    public List<User> getByName(String name, String surname) {
        return userRepository.getUserByNameAndSurname(name,surname);
    }

    @Override
    public User save(UserRequest userRequest) {
        User user = new User();
        user.setName(userRequest.getName());
        user.setSurname(userRequest.getSurname());
        user.setYear(userRequest.getYear());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        user.setStatus(Status.INACTIVE);
        return userRepository.save(user);
    }
}
