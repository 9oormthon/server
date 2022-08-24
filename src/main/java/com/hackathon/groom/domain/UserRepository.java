package com.hackathon.groom.domain;

import com.hackathon.groom.domain.repository.UserRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>, UserRepositoryCustom {


}
