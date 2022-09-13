package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter

@Entity
@Table(name = ("merchants"))
public class Merchant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String status;
    @Column(name = "created_at")
    private LocalDateTime created_At;
    @Column(name = "updated_at")
    private LocalDateTime updated_At;
    @Column(name = "deleted_at")
    private LocalDateTime deleted_At;
}
