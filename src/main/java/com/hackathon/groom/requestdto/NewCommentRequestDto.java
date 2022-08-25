package com.hackathon.groom.requestdto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
public class NewCommentRequestDto {

    private String userName;
    private String contents;
    private LocalDateTime createdAt;
}
