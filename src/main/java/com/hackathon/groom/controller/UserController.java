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

    @GetMapping("/myPage/posts")
    public boolean getMyPosts(@RequestParam String userName) {
        postService.getPostsByUserName(userName);
        return true;
    }

    @GetMapping("/myPage/comments")
    public boolean getMyComments(@RequestParam String userName) {
        commentService.getCommentsByUserName(userName);
        return true;
    }

}
