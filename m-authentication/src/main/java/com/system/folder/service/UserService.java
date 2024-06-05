package com.system.folder.service;

import com.system.folder.action.UserAction;
import com.system.folder.api.request.UserLoginRequest;
import com.system.folder.api.request.UserRegisterRequest;
import com.system.folder.api.response.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserAction userAction;


    public UserResponse registerUser(UserRegisterRequest userRegisterRequest) {
        var response = new UserResponse();

        if (userAction.exists(userRegisterRequest)) {
            response.setDescription("User already exists");
            return response;
        }

        var user = userAction.convertToUser(userRegisterRequest);
        userAction.register(user);
        response.setDescription("User registered successfully");
        return response;

    }

    public UserResponse loginUser(UserLoginRequest userLoginRequest) {
        var response = new UserResponse();
        if (userAction.login(userLoginRequest)) {
            response.setDescription("User logged in successfully");
        }
        return response;
    }
}
