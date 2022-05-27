package uz.isystem.Market.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
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


}
