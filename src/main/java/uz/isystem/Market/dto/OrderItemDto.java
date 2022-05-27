package uz.isystem.Market.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter

public class OrderItemDto {


    private Integer id;
@NotBlank(message = ("orderda hatolik!"))
    private String Order;
@NotBlank(message = ("productda hatolik!"))
    private String Product;

    private String status;



}
