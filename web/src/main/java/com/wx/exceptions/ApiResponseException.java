package com.wx.exceptions;


import com.wx.enums.ApplicationError;

/**
 * @author chi  2017-09-04 13:30
 **/
public class ApiResponseException extends RuntimeException{

    private Integer code;

    public ApiResponseException() {
    }

    public ApiResponseException(String msg) {
        super(msg);
    }

    public ApiResponseException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public ApiResponseException(ApplicationError e){
        super(e.getTemplate());
        this.code = e.getKey();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
