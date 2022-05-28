package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter

@Entity
@Table(name = ("brands"))
public class Brand {

    private Integer id;

    private String name;

    private String status;

    private LocalDateTime create_At;

    private LocalDateTime updated_At;

    private LocalDateTime deleted_At;





}
