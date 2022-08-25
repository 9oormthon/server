package com.hackathon.groom.service;


import com.hackathon.groom.domain.Post;
import com.hackathon.groom.domain.PostRepository;
import com.hackathon.groom.domain.User;
import com.hackathon.groom.domain.UserRepository;
import com.hackathon.groom.requestdto.NewPostRequestDto;
import com.hackathon.groom.responsedto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Service
public class PostService {

    private final PostRepository postRepository;
    private final UserRepository userRepository;
    public void createPost(NewPostRequestDto newPostRequestDto) {
        //userName DB에 있는지 체크해주는 로직 필요할 듯

        String username = newPostRequestDto.getUserName();
        User user = userRepository.findUserByUserName(username);

        Post post = new Post(); //anti pattern
        post.setTitle(newPostRequestDto.getTitle());
        post.setCreatedAt(LocalDateTime.now());
        post.setCategory(newPostRequestDto.getCategory());
        post.setContents(newPostRequestDto.getContents());
        post.setLocation(newPostRequestDto.getLocation());
        post.setUserId(user.getId());

        postRepository.save(post);
    }

    public List<PostsResponseDto> getPosts() {
        return postRepository.findPosts();
    }
}
