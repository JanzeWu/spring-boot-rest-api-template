package com.ipin.mas.advice;

import com.ipin.mas.controller.SchoolController;
import com.ipin.mas.errorhandler.AppException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


/**
 * Created by janze on 3/14/18.
 */
@ControllerAdvice(basePackageClasses = SchoolController.class)
public class SchoolControllerAdvice extends ResponseEntityExceptionHandler {

    @ExceptionHandler(AppException.class)
    public ResponseEntity<?> handleControllerException(AppException ex){

        return ResponseEntity.ok(ex.toString());

    }

}

