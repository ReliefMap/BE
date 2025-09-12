package com.fisa.reliefmap_backend.common.exception.handler;

import com.fisa.reliefmap_backend.common.exception.CustomException;
import com.fisa.reliefmap_backend.common.response.BaseErrorResponse;
import jakarta.annotation.Priority;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@Priority(0)
@RestControllerAdvice
public class CustomExceptionControllerAdvice {

    /**
     * 특정 비즈니스/보안/인증 관련 예외 추가
     */

}
