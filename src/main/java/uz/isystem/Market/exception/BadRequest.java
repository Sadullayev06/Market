package uz.isystem.Market.exception;

import org.springframework.web.client.HttpClientErrorException;

public class BadRequest extends RuntimeException{
    public BadRequest(String message){
        super(message);
    }
}
