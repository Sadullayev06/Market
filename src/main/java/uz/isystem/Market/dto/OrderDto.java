package uz.isystem.Market.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class OrderDto {


    private Integer id;

    private Integer user;

    private LocalDateTime deliveryDate;
    @NotBlank(message = ("requirmentda hatolik!"))
    private String requirment;
    @NotBlank(message = ("contactda hatolik!"))
    private String contact;
    @NotBlank(message = ("adressda hatolik!"))
    private String adress;

    private LocalDateTime deleveredDate;

    private String status;

    private Double total_payment;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

    private LocalDateTime deleteAt;






}
