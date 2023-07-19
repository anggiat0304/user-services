package com.service.userservices.service.impl;

import com.service.userservices.model.UserModel;
import com.service.userservices.repository.UserRepository;
import com.service.userservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public UserModel createUser(UserModel userModel) {
        UserModel save = userRepository.save(userModel);
        return save;
    }
}
