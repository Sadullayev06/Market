package uz.isystem.Market.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = ("orderitems"))
public class OrderItem {


    private Integer id;

    private String Order;

    private String Product;

    private String status;






}
