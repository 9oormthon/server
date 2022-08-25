package com.hackathon.groom.requestdto;

import com.hackathon.groom.domain.Post;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
@RequiredArgsConstructor
public class NewPostRequestDto {

    private Long id;

    private String title;

    private String contents;

    private LocalDateTime createdAt;

    private String location;

    private String category;

    private String username;

}


