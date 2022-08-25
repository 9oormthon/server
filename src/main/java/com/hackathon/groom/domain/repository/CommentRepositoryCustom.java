package com.hackathon.groom.domain.repository;

import com.hackathon.groom.domain.Comment;
import com.hackathon.groom.responsedto.CommentResponseDto;
import com.hackathon.groom.responsedto.MyPageCommentResponseDto;

import java.util.List;

public interface CommentRepositoryCustom {

    List<CommentResponseDto> findCommentsByPostId(Long postId);

    void deleteCommentsByPostId(Long postId);

    List<MyPageCommentResponseDto> findCommentsByUserName(String userName);
}
