package com.hackathon.groom.responsedto;

import com.hackathon.groom.domain.Comment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostResponseDto {

    private Long postId;
    private String userName;
    private String title;
    private String contents;
    private LocalDateTime createdAt;
    private List<Comment> comment;
    private Integer commentsCount;
    private String category;
    private Integer years;
}
