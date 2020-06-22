package com.bandtec.techconnective.exceptionHandler;

import com.bandtec.techconnective.exception.EventoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.OffsetDateTime;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    @ExceptionHandler(EventoException.class)
    public ResponseEntity<Object> handleProblema(EventoException ex, WebRequest request) {
        var status = HttpStatus.BAD_REQUEST;

        Problem problem = new Problem();
        problem.setStatus(status.value());
        problem.setTitulo(ex.getMessage());
        problem.setDataHora(OffsetDateTime.now());

        return handleExceptionInternal(ex, problem, new HttpHeaders(), status, request);
    }
}
