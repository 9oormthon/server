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
public class CommentResponseDto {

    private Long commentId;
    private LocalDateTime createdAt;
    private String contents;
    private String userName;
    private Long postId;
}
