package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = ("userRoles"))
public class UserRole {

    private Integer id;

    private String name;

    private Boolean status;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

    private LocalDateTime deleteAt;






}
