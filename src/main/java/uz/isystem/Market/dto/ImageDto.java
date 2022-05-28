package uz.isystem.Market.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ImageDto {


    //hov

    private Integer id;
    @NotBlank(message = ("pathda hatolik!"))
    private String path;
    @NotBlank(message = ("typeda hatolik!"))
    private String type;
    private Long size;
    private String token;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

    private LocalDateTime deleteAt;




}
