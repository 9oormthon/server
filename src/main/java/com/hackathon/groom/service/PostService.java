package com.hackathon.groom.service;


import com.hackathon.groom.domain.Post;
import com.hackathon.groom.domain.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;

    public void createPost(Post post) {
        postRepository.save(post);
    }
}
