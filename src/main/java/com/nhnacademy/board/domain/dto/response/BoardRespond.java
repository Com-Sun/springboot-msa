package com.nhnacademy.board.domain.dto.response;

import java.util.Date;
import lombok.Getter;

@Getter
public class BoardRespond {
    Long postNum;
    Long memberNum;
    String postTitle;
    String postContent;
    Date createdDate;
    Date modifiedDate;
    Integer deleteCheck;
    Long modifyMemberNum;
    Long memberNum2;
    String memberId;
    String memberPwd;
    String modifyMemberId;
    Long commentCount;

    public BoardRespond(Long postNum, Long memberNum, String postTitle, String postContent,
                        Date createdDate, Date modifiedDate, Integer deleteCheck,
                        Long modifyMemberNum, Long memberNum2, String memberId,
                        String memberPwd) {
        this.postNum = postNum;
        this.memberNum = memberNum;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.deleteCheck = deleteCheck;
        this.modifyMemberNum = modifyMemberNum;
        this.memberNum2 = memberNum2;
        this.memberId = memberId;
        this.memberPwd = memberPwd;
    }

    public void setModifyMemberId(String modifyMemberId) {
        this.modifyMemberId = modifyMemberId;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }
}
