package com.hackathon.groom.domain;

import com.hackathon.groom.domain.repository.PostRepositoryCustom;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostRepository extends JpaRepository<Post, Long>, PostRepositoryCustom {
}
