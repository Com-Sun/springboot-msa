package com.nhnacademy.board.domain.dto.request;

import lombok.Value;

@Value
public class PostRequestDto {
    String postTitle;
    String postContent;
}
