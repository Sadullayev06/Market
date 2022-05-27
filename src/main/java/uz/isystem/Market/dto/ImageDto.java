package uz.isystem.Market.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter

public class ImageDto {


    //hov

    private Integer id;
    @NotBlank(message = ("pathda hatolik!"))
    private String path;
    @NotBlank(message = ("typeda hatolik!"))
    private String type;
    private Long size;
    private String token;


}
