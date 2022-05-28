package uz.isystem.Market.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OsDto {


    private Integer id;

    private String name;

    private String status;

    private LocalDateTime created_At;

    private LocalDateTime update_At;

    private LocalDateTime deleted_At;








}
