package com.hackathon.groom.domain.repository;

import com.hackathon.groom.domain.User;

public interface UserRepositoryCustom {

    User findUserByUserName(String username);

}
