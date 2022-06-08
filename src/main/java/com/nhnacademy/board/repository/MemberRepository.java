package com.nhnacademy.board.repository;

import com.nhnacademy.board.entity.Member;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
    Optional<Member> findByMemberId(String memberId);
}
