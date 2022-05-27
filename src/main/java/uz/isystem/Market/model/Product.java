package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

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













}
