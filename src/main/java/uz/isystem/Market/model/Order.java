package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = ("orders"))
public class Order {


    private Integer id;

    private Integer user;

    private LocalDateTime deliveryDate;

    private String requirment;

    private String contact;

    private String address;

    private LocalDateTime delevereDate;

    private Boolean status;

    private Double total_payment;

    private LocalDateTime createdAt;

    private LocalDateTime updateAt;

    private LocalDateTime deleteAt;









}
