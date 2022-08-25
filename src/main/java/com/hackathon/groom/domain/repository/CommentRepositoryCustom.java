package com.hackathon.groom.domain.repository;

import com.hackathon.groom.domain.Comment;

import java.util.List;

public interface CommentRepositoryCustom {

    List<Comment> findCommentsByPostId(Long postId);

    void deleteCommentsByPostId(Long postId);
}
