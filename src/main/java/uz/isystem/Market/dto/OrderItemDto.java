package uz.isystem.Market.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderItemDto {


    private Integer id;
    @NotBlank(message = ("orderda hatolik!"))
    private String Order;
    @NotBlank(message = ("productda hatolik!"))
    private String Product;

    private String status;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

    private LocalDateTime deleteAt;

}
