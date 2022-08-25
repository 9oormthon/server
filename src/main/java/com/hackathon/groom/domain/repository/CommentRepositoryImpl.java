package com.hackathon.groom.domain.repository;

import com.hackathon.groom.domain.Comment;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.hackathon.groom.domain.QComment.comment;

@RequiredArgsConstructor
public class CommentRepositoryImpl implements CommentRepositoryCustom {

    private final JPAQueryFactory queryFactory;


    @Override
    public List<Comment> findCommentsByPostId(Long postId) {
        return queryFactory
                .selectFrom(comment)
                .where(comment.postId.eq(postId))
                .orderBy(comment.createdAt.desc())
                .limit(10)
                .fetch();
    }
}
