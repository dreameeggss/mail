package com.wx.exceptions;

/**
 * @author chi  2017-09-11 15:24
 **/
public class NoSuchRequestException extends ApiResponseException{

    public NoSuchRequestException() {
        super();
    }

    @Override
    public String getMessage() {
        return "该申请不存在";
    }
}
