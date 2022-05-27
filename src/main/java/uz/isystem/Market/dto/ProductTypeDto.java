package uz.isystem.Market.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class ProductTypeDto {


    private Integer id;
    @NotBlank(message = ("nameda hatolik!"))
    private String name;

    private String status;


}
