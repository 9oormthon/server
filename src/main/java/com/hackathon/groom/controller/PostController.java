package com.hackathon.groom.controller;
import com.hackathon.groom.domain.Post;
import com.hackathon.groom.requestdto.NewPostRequestDto;
import com.hackathon.groom.responsedto.PostResponseDto;
import com.hackathon.groom.responsedto.PostsResponseDto;
import com.hackathon.groom.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PostController {

    private final PostService postService;

    @PostMapping("/post")
    public boolean createPost(@RequestBody NewPostRequestDto newPostRequestDto) {
        postService.createPost(newPostRequestDto);
        return true;
    }

    @GetMapping("/posts")
    public List<PostsResponseDto> getPosts() {
        return postService.getPosts();
    }

    @GetMapping("/list/{postId}")
    public PostResponseDto getPost(@PathVariable Long postId) {
        return postService.getPost(postId);

    }

}