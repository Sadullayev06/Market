package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = ("orders"))
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer user;

    private LocalDateTime deliveryDate;

    private String requirment;

    private String contact;

    private String address;

    private LocalDateTime delevereDate;

    private Boolean status;

    private Double total_payment;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updateAt;
    @Column(name = "deleted_at")
    private LocalDateTime deleteAt;


}
