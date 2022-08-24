package com.hackathon.groom.service;


import com.hackathon.groom.domain.User;
import com.hackathon.groom.domain.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    public boolean createUser(User user) {
        if (userRepository.findUserByUserId(user.getUserId()) == null) {
            userRepository.save(user);
        } else {
            return false;
        }

        return true;
    }

}
