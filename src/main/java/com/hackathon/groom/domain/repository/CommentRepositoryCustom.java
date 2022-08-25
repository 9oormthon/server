package com.hackathon.groom.domain.repository;

import com.hackathon.groom.domain.Comment;
import com.hackathon.groom.responsedto.CommentResponseDto;

import java.util.List;

public interface CommentRepositoryCustom {

    List<CommentResponseDto> findCommentsByPostId(Long postId);

    void deleteCommentsByPostId(Long postId);
}
