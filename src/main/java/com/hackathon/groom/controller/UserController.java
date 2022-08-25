package com.hackathon.groom.controller;

import com.hackathon.groom.domain.Comment;
import com.hackathon.groom.domain.User;
import com.hackathon.groom.responsedto.MyPageCommentResponseDto;
import com.hackathon.groom.responsedto.PostsResponseDto;
import com.hackathon.groom.service.CommentService;
import com.hackathon.groom.service.PostService;
import com.hackathon.groom.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class UserController {

    private final UserService userService;
    private final PostService postService;
    private final CommentService commentService;

    @PostMapping("/signup")
    public boolean signUpWithNickname(@RequestBody User user) {
        return userService.createUser(user);
    }

    @GetMapping("/myPage/posts")
    public List<PostsResponseDto> getMyPosts(@RequestParam String userName) {
        return postService.getPostsByUserName(userName);

    }

    @GetMapping("/myPage/comments")
    public List<MyPageCommentResponseDto> getMyComments(@RequestParam String userName) {
        return commentService.getCommentsByUserName(userName);
    }

}
