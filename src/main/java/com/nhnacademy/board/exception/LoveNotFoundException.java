package com.nhnacademy.board.exception;

public class LoveNotFoundException extends IllegalArgumentException {
    public LoveNotFoundException(String message) {
        super(message);
    }
}
