package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = ("userroles"))
public class UserRole {

    private Integer id;

    private String name;

    private String status;






}
