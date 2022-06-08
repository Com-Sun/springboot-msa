package com.nhnacademy.board.domain.dto.request;

import lombok.Value;

@Value
public class LoginRequestDto {
    String memberId;
    String memberPwd;
}
