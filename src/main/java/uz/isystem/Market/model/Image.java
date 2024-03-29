package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = ("images"))
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String path;
    private String type;
    private Long size;
    private String token;
    private Boolean status;
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    @Column(name = "updated_at")
    private LocalDateTime updateAt;
    @Column(name = "deleted_at")
    private LocalDateTime deleteAt;
}
