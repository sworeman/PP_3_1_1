package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void update(User user);
    void delete(Long id);
    User find(Long id);
    List<User> findAll();
}
