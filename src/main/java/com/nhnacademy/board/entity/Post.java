package com.nhnacademy.board.entity;

import java.util.Date;
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
@Table(name = "post")
@Entity
public class Post {
    @Id
    private Long postNum;
    private Long memberNum;
    private String postTitle;
    private String postContent;
    private Date createdDate;
    private Date modifiedDate;
    private Integer deleteCheck;
    private Long modifyMemberNum;

    @Builder
    public Post(Long postNum, Long memberNum, String postTitle, String postContent,
                Date createdDate, Date modifiedDate, Integer deleteCheck,
                Long modifyMemberNum) {
        this.postNum = postNum;
        this.memberNum = memberNum;
        this.postTitle = postTitle;
        this.postContent = postContent;
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.deleteCheck = deleteCheck;
        this.modifyMemberNum = modifyMemberNum;
    }

    @Override
    public String toString() {
        return "Post{" +
            "postNum=" + postNum +
            ", memberNum=" + memberNum +
            ", postTitle='" + postTitle + '\'' +
            ", postContent='" + postContent + '\'' +
            ", createdDate=" + createdDate +
            ", modifiedDate=" + modifiedDate +
            ", deleteCheck=" + deleteCheck +
            ", modifyMemberNum=" + modifyMemberNum +
            '}';
    }
}
