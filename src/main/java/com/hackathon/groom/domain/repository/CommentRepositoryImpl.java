package com.hackathon.groom.domain.repository;

import com.hackathon.groom.domain.Comment;
import com.hackathon.groom.responsedto.CommentResponseDto;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.hackathon.groom.domain.QComment.comment;
import static com.hackathon.groom.domain.QUser.user;

@RequiredArgsConstructor
public class CommentRepositoryImpl implements CommentRepositoryCustom {

    private final JPAQueryFactory queryFactory;


    @Override
    public List<CommentResponseDto> findCommentsByPostId(Long postId) {
        return queryFactory
                .select(Projections.bean(
                        CommentResponseDto.class,
                        comment.id.as("commentId"),
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
}
