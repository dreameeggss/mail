package com.wx.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.Instant;

/**
 * Created by 王汗超 on 2017/5/24.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO<T> {

    /**
     * 存储错误信息
     */
    private String message = "success";

    private String path;

    private int status = HttpStatus.OK.value();

    private long timestamp = Instant.now().toEpochMilli();

    private T data;

    private Boolean success;

    public ResponseDTO(String message, int status) {
            this.message = message;
            this.status = status;
    }

    public ResponseDTO(int status) {
        this.status = status;
    }


    public ResponseDTO(String message, int status, long timestamp, T data, Boolean success) {
        this.message = message;
        this.status = status;
        this.timestamp = timestamp;
        this.data = data;
        this.success = success;
    }

    public static<T> ResponseDTO success(T data){
        ResponseDTO<Object> result = new ResponseDTO("success",HttpStatus.OK.value(),Instant.now().toEpochMilli(),data,true);
        return result;
    }

    public static ResponseDTO success() {
        return success(null);
    }

    /**
     * 错误信息
     * @param msg
     * @return
     */
    public static ResponseDTO error(String msg){
        ResponseDTO<Object> result = new ResponseDTO(msg,HttpStatus.FORBIDDEN.value(),Instant.now().toEpochMilli(),null,true);
        return result;
    }

}
