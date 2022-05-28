package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = ("users"))
public class User {

    private Integer id;

    private String name;

    private String surname;
    @Email
    private String email;

    private String password;

    private String contact;

    private Integer imageId;

    private String status;

    private String UserRole;

    private Integer addressId;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

    private LocalDateTime deleteAt;












}
