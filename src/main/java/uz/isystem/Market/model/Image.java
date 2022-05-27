package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = ("images"))
public class Image {

    //hov

    private Integer id;

    private String path;

    private String type;

    private Long size;

    private String token;












}
