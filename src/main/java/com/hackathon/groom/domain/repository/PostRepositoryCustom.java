package com.hackathon.groom.domain.repository;

import com.hackathon.groom.responsedto.PostResponseDto;
import com.hackathon.groom.responsedto.PostsResponseDto;

import java.util.List;

public interface PostRepositoryCustom {
    List<PostsResponseDto> findPosts();

    PostResponseDto findPostById(Long postId);

    List<PostsResponseDto> findPostsByUserName(String userName);

//    long deletePostById(Long postId);
}
