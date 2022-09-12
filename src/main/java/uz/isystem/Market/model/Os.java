package uz.isystem.Market.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = ("oses"))
public class Os {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String status;

    private LocalDateTime created_At;

    private LocalDateTime update_At;

    private LocalDateTime deleted_At;


}
