package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
    public User getUserByID(){
        return  userRepository.getById(1);
    }

    public void addNewUser(User user) {
        System.out.println(user);
    }
}
