package com.nhnacademy.board.service.impl;

import com.nhnacademy.board.domain.dto.request.LoginRequestDto;
import com.nhnacademy.board.entity.Member;
import com.nhnacademy.board.repository.MemberRepository;
import com.nhnacademy.board.service.MemberService;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DefaultMemberService implements MemberService {
    private final MemberRepository memberRepository;

    @Override
    public Optional<Member> getMemberByMemberId(String memberId) {
        return memberRepository.findByMemberId(memberId);
    }

    @Override
    public Optional<Member> getMemberByMemberNum(Long memberNum) {
        return memberRepository.findById(memberNum);
    }

    @Override
    public boolean matches(LoginRequestDto loginRequestDto) {
        Optional<Member> member = getMemberByMemberId(loginRequestDto.getMemberId());

        return member.map(x -> x.getMemberPwd().equals(loginRequestDto.getMemberPwd())).orElse(false);
    }
}
