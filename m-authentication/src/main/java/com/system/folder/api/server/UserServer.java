package com.system.folder.api.server;


import com.system.folder.api.request.UserLoginRequest;
import com.system.folder.api.request.UserRegisterRequest;
import com.system.folder.api.response.UserResponse;
import com.system.folder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserServer {


    @Autowired
    private UserService userService;


    @PostMapping(value = "/register",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserResponse> registerUser(@RequestBody UserRegisterRequest userRegisterRequest) {
        var user = userService.registerUser(userRegisterRequest);
        return ResponseEntity.ok().body(user);
    }

    @PostMapping(value = "/login",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<UserResponse> loginUser(@RequestBody UserLoginRequest userLoginRequest) {
        var response = userService.loginUser(userLoginRequest);
        if (response.getDescription().isEmpty()) {
            response.setDescription("User not logged in (Some field must be incorrect)");
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(response);

        }
        return ResponseEntity.ok().body(response);
    }
}
