package com.hackathon.groom.domain.repository;

import com.hackathon.groom.responsedto.PostsResponseDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;
import static com.hackathon.groom.domain.QPost.post;
import static com.hackathon.groom.domain.QUser.user;

@RequiredArgsConstructor
public class PostRepositoryImpl implements PostRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<PostsResponseDto> findPosts() {
        return queryFactory
                .select(Projections.bean(
                        PostsResponseDto.class,
                        post.id.as("postId"),
                        post.contents,
                        post.createdAt,
                        post.title,
                        user.userName,
                        user.years
                ))
                .from(post)
                .join(user).on(post.userId.eq(user.id))
                .orderBy(post.createdAt.desc())
                .limit(10)
                .fetch();
    }
}
