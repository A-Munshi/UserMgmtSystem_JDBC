package com.example.dao;

import com.example.model.User;

import java.util.List;

public interface UserDAO {
    void addUser(User user);
    void updateUser(User user);
    void deleteUser(int id);
    User getUserById(int id);
    List<User> getAllUsers();
    // Additional Search Methods
    List<User> searchByName(String name);
    User searchByEmail(String email);
}