package com.wx.exceptions;

/**
 * Created by ethan-liu on 16/5/8.
 */
public class NoSuchRoleException extends OperationException {

    public NoSuchRoleException() {
        super();
    }

    public NoSuchRoleException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Role not found.";
    }
}
