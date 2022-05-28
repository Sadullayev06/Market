package uz.isystem.Market.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AddressDto {


    private Integer id;
    @NotBlank(message = ("regionda hatolik!"))
    private String region;
    @NotBlank(message = ("cityda hatolik!"))
    private String City;
    @NotBlank(message = ("districtda hatolik!"))
    private String District;
    @NotBlank(message = ("streetda hatolik!"))
    private String Street;

    private Integer Home;

    private Boolean status;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

    private LocalDateTime deleteAt;



}
