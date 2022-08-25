package com.hackathon.groom.service;

import com.hackathon.groom.domain.Comment;
import com.hackathon.groom.domain.CommentRepository;
import com.hackathon.groom.domain.User;
import com.hackathon.groom.domain.UserRepository;
import com.hackathon.groom.requestdto.NewCommentRequestDto;
import com.hackathon.groom.responsedto.MyPageCommentResponseDto;
import com.hackathon.groom.responsedto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CommentService {

    private final UserRepository userRepository;
    private final CommentRepository commentRepository;

    public void createComment(NewCommentRequestDto newCommentRequestDto) {
        String username = newCommentRequestDto.getUserName();
        User user = userRepository.findUserByUserName(username);

        Comment comment = new Comment();
        comment.setContents(newCommentRequestDto.getContents());
        comment.setCreatedAt(LocalDateTime.now());
        comment.setUserId(user.getId());
        comment.setPostId(newCommentRequestDto.getPostId());


        commentRepository.save(comment);
    }

    public List<MyPageCommentResponseDto> getCommentsByUserName(String userName) {
        return commentRepository.findCommentsByUserName(userName);
    }
}
