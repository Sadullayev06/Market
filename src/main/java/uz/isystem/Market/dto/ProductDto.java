package uz.isystem.Market.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class ProductDto {


    private Integer id;
@NotBlank(message = ("nameda hatolik!"))
    private String name;
@NotBlank(message = ("descriptionda hatolik!"))
    private String description;

    private Double price;

    private Integer rate;

    private Boolean visible;
@NotBlank(message = ("producttypeda hatolik!"))
    private String ProductType;

    private String status;







}
