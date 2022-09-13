package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = ("productTypes"))
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    private Boolean status;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updateAt;
    @Column(name = "deleted_at")
    private LocalDateTime deleteAt;


}
