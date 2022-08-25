package com.hackathon.groom.controller;

import com.hackathon.groom.domain.Comment;
import com.hackathon.groom.requestdto.NewCommentRequestDto;
import com.hackathon.groom.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class CommentController {

    private final CommentService commentService;
    @PostMapping("/comment")
    public boolean createComment(@RequestBody NewCommentRequestDto newCommentRequestDto) {
        commentService.createComment(newCommentRequestDto);
        return true;
    }


}
