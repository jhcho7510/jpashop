package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ITEM")
public class Item {
    @Id @GeneratedValue
    @Column(name = "ITEM_ID",length = 100)
    private Long id;

    private String name;
    private int price;
    private int stockQuanitity;

    @Transient
    private String status;
}
