package com.nhnacademy.board.service;

import com.nhnacademy.board.domain.dto.request.PostRequestDto;
import com.nhnacademy.board.domain.dto.response.BoardRespond;
import com.nhnacademy.board.entity.Post;
import java.util.List;
import java.util.Optional;

public interface PostService {
    Optional<Post> getPostByPostNum(Long postNum);
    List<BoardRespond> getPosts(Integer deleteCheck, int page);
    void insertPost(PostRequestDto postRegisterRequest, Long memberNum);

    void modifyPost(String postTitle, String postContent, Long postNum, Long memberNum);
    void deletePost(Integer deleteCheck, Long postNum);
    int getPostSize(Integer deleteCheck);
    int getPageSize(Integer deleteCheck);
    void matchCheckSessionIdAndWriterId(Long postNum, String sessionId);
//    Optional<Member> findWriterIdPostNum(Long postNum);
    Long getCommentSize(Long postNum);
    void restorePostByPostNum(Long postNum, String sessionId);

    //검색기능 추가
    List<BoardRespond> getPostsWithSearch(Integer deleteCheck, int page, String searchValue);
}
