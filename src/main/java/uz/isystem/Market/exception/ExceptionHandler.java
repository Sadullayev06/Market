package uz.isystem.Market.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.client.HttpClientErrorException;

import static org.springframework.web.client.HttpClientErrorException.*;

@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler
    public ResponseEntity<?> exception(BadRequest a){
        return ResponseEntity.badRequest().body(a.getMessage());
    }

}
