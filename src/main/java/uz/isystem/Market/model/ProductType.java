package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = ("productTypes"))
public class ProductType {

    private Integer id;

    private String name;

    private Integer merchant_id;

    private Integer core;

    private String material;

    private String display;

    private Integer ram;

    private Integer camera_fron;

    private Integer camera_back;

    private Integer os;

    private Integer storage;

    private Integer bran_id;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

    private LocalDateTime deleteAt;




}
