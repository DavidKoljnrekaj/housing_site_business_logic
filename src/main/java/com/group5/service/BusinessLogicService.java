package com.group5.service;

import com.group5.model.User;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface BusinessLogicService {
    Optional<User> findUserById(Long id);
}
