package com.nhnacademy.board.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "member")
@Entity
public class Member {
    @Id
    @Column(name = "member_num")
    private Long memberNum;

    @Column(name = "member_id")
    private String memberId;

    @Column(name = "member_pwd")
    private String memberPwd;

    @Column(name = "member_grade")
    private String memberGrade;

    @Builder(builderClassName = "MemberBuilder")
    private Member(Long memberNum, String memberId, String memberPwd,
                  String memberGrade) {
        this.memberNum = memberNum;
        this.memberId = memberId;
        this.memberPwd = memberPwd;
        this.memberGrade = memberGrade;
    }
}
