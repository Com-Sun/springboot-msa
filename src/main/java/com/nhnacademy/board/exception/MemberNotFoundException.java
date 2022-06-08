package com.nhnacademy.board.exception;

public class MemberNotFoundException extends IllegalArgumentException {
    public MemberNotFoundException(String message) {
        super(message);
    }
}
