package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Entity
@Table(name = ("addresses"))
public class Address {


    private Integer id;

    private String region;

    private String City;

    private String District;

    private String Street;

    private Integer Home;









}
