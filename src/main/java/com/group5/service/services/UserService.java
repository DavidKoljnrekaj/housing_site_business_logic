package com.group5.service.services;

import com.group5.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface UserService {

    User getUserById(String email);
    Optional<User> createUser(String email, String name, String surname, String password);
    boolean Login(String email, String password);
}
