package com.hackathon.groom.responsedto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MyPageCommentResponseDto {

    private LocalDateTime createdAt;
    private Long commentId;
    private String contents;
    private Long postId;
    private String postTitle;
}
