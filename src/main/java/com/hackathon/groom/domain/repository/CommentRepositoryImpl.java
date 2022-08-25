package com.hackathon.groom.domain.repository;

import com.hackathon.groom.domain.Comment;
import com.hackathon.groom.responsedto.CommentResponseDto;
import com.hackathon.groom.responsedto.MyPageCommentResponseDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.hackathon.groom.domain.QComment.comment;
import static com.hackathon.groom.domain.QUser.user;
import static com.hackathon.groom.domain.QPost.post;

@RequiredArgsConstructor
public class CommentRepositoryImpl implements CommentRepositoryCustom {

    private final JPAQueryFactory queryFactory;


    @Override
    public List<CommentResponseDto> findCommentsByPostId(Long postId) {
        return queryFactory
                .select(Projections.bean(
                        CommentResponseDto.class,
                        comment.id.as("comment.id"),
                        comment.contents,
                        comment.createdAt,
                        user.userName,
                        comment.postId
                        ))
                .from(comment)
                .join(user).on(comment.userId.eq(user.id))
                .where(comment.postId.eq(postId))
                .orderBy(comment.createdAt.desc())
                .limit(10)
                .fetch();
    }

    @Override
    public void deleteCommentsByPostId(Long postId) {
        queryFactory
                .delete(comment)
                .where(comment.postId.eq(postId))
                .execute();
    }

    @Override
    public List<MyPageCommentResponseDto> findCommentsByUserName(String userName) {
        return queryFactory
                .select(Projections.bean(
                        MyPageCommentResponseDto.class,
                        comment.id,
                        comment.contents,
                        comment.createdAt,
                        post.location,
                        post.category,
                        post.title
                ))
                .from(comment)
                .join(user).on(comment.userId.eq(user.id))
                .join(post).on(comment.postId.eq(post.id))
                .where(user.userName.eq(userName))
                .limit(10)
                .fetch();
    }
}
