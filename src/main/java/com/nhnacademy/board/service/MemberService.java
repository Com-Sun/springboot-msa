package com.nhnacademy.board.service;

import com.nhnacademy.board.domain.dto.request.LoginRequestDto;
import com.nhnacademy.board.entity.Member;
import java.util.Optional;

public interface MemberService {
    Optional<Member> getMemberByMemberId(String memberId);
    Optional<Member> getMemberByMemberNum(Long memberNum);

    boolean matches(LoginRequestDto loginRequestDto);

//    boolean login()
}
