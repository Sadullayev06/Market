package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = ("products"))
public class Product {


    private Integer id;

    private String name;

    private String description;

    private Double price;

    private Integer rate;

    private Boolean visible;

    private String ProductType;

    private String status;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

    private LocalDateTime deleteAt;













}
