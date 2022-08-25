package com.hackathon.groom.controller;
import com.hackathon.groom.domain.Post;
import com.hackathon.groom.requestdto.NewPostRequestDto;
import com.hackathon.groom.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PostController {

    private final PostService postService;

    @PostMapping("/new_post")
    public boolean createPost(@RequestBody Post post) {
        postService.createPost(post);
        return true;
    }
}
