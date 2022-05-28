package uz.isystem.Market.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductTypeDto {


    private Integer id;
    @NotBlank(message = ("nameda hatolik!"))
    private String name;

    private Integer merchant_id;

    private Integer core;

    private String material;

    private String display;

    private Integer ram;

    private Integer camera_fron;

    private Integer camera_back;

    private Integer os;

    private Integer storage;

    private Integer bran_id;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

    private LocalDateTime deleteAt;



}
