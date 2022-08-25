package com.hackathon.groom.requestdto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class DeletePostRequestDto {

    private String userName;
    private Long postId;
}
