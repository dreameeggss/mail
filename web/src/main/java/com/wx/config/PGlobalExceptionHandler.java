package com.wx.config;



import com.wx.dto.ResponseDTO;
import com.wx.exceptions.ApiResponseException;
import com.wx.exceptions.OperationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.stream.Collectors;

/**
 * Created by 王汗超 on 2017/6/12.
 * <p>
 * 全局异常处理配置
 */

@ControllerAdvice
public class PGlobalExceptionHandler {


    private final Logger logger = LoggerFactory.getLogger(getClass());


    /**
     * guo
     * 自定义异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler({OperationException.class})
    public ResponseEntity unauthorizedException(RuntimeException e) {
        logger.error("Error",e.getMessage());
        return new ResponseEntity<>(ResponseDTO.error(e.getMessage()), HttpStatus.FORBIDDEN);
    }


    /**
     * guo
     * 接受参数类型不对抛出的异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity methodArgumentNotValidException(MethodArgumentNotValidException e) {
        logger.error("Error",e);
        StringBuilder sb = new StringBuilder();
        e.getBindingResult().getFieldErrors().stream()
                .map(FieldError::getDefaultMessage).collect(Collectors.toList())
                .forEach(s ->
                        sb.append(s).append(";"));
        return new ResponseEntity<>(ResponseDTO.error(sb.toString()),
                HttpStatus.FORBIDDEN);
    }

    @ExceptionHandler(value = ApiResponseException.class)
    public ResponseEntity handle(ApiResponseException e) {
        logger.error("Error",e.getMessage());
        return new ResponseEntity<>(ResponseDTO.error(e.getMessage()), HttpStatus.FORBIDDEN);
    }


}
