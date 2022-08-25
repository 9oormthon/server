package com.hackathon.groom.controller;

import com.hackathon.groom.domain.Comment;
import com.hackathon.groom.domain.User;
import com.hackathon.groom.service.CommentService;
import com.hackathon.groom.service.PostService;
import com.hackathon.groom.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/mypage/posts")
    public boolean getMyPosts(@RequestBody String userName) {
        postService.getPostsByUserName(userName);
        return true;
    }

    @GetMapping("/mypage/comments")
    public boolean getMyComments(@RequestBody String userName) {
        commentService.getCommentsByUserName(userName);
        return true;
    }

}
