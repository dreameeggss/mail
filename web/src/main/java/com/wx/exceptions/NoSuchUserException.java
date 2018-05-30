package com.wx.exceptions;

/**
 * Created by ethan-liu on 16/4/6.
 */
public class NoSuchUserException extends OperationException {

    public NoSuchUserException() {
        super();
    }

    public NoSuchUserException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "User not found.";
    }
}
