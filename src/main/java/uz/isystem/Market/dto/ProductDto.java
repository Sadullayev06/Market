package uz.isystem.Market.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
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

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

    private LocalDateTime deleteAt;



}
