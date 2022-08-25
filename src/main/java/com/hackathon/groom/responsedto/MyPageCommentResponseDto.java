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
    private String title;
    private String contents;
    private String postLocation;
    private String postCategory;
    private String postTitle;
}
