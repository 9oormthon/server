package com.hackathon.groom.responsedto;

import com.hackathon.groom.domain.Post;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostsResponseDto {

    private Long postId;
    private String title;
    private String contents;
    private LocalDateTime createdAt;
    private String userName;
    private Integer years;
    private String location;
    private String category;
}
