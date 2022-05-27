package uz.isystem.Market.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class UserDto {



    private Integer id;
@NotBlank(message = ("nameda hatolik!"))
    private String name;
@NotBlank(message = ("surnameda hatolik!"))
    private String surname;
    @Email
    @NotBlank(message = ("emailda hatolik!"))
    private String email;
@NotBlank(message = ("passwordda hatolik!"))
    private String password;
@NotBlank(message = ("contactda hatolik!"))
    private String contact;

    private Integer imageId;

    private String status;
@NotBlank(message = ("userroleda hatolik!"))
    private String UserRole;

    private Integer adressId;





}
