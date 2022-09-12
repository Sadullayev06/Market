package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = ("users"))
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String surname;
    @Email
    private String email;

    private String password;

    private String contact;

    private Integer imageId;

    private Boolean status;

    private String UserRole;

    private Integer addressId;

    @Column(name = ("created_at"))
    private LocalDateTime createdAt;

    @Column(name = ("update_at"))
    private LocalDateTime updateAt;

    @Column(name = ("delete_at"))
    private LocalDateTime deleteAt;

    @OneToMany
    @JoinColumn(name = ("user"), insertable = false, updatable = false)
    private User user;

    @Column(name = ("user"))
    private Integer userId;

}
