package com.hackathon.groom.controller;

import com.hackathon.groom.domain.User;
import com.hackathon.groom.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;

    @PostMapping("/signup")
    public boolean signUpWithNickname(@RequestBody User user) {
        return userService.createUser(user);
    }

}
