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

    private String adress;

    private LocalDateTime deleveredDate;

    private String status;

    private Double total_payment;









}
