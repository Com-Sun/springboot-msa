package com.nhnacademy.board.exception;

public class CommentNotFouncException extends IllegalArgumentException {
    public CommentNotFouncException(String message) {
        super(message);
    }
}
