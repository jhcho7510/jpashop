package jpabook.jpashop.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "MEMBER")
public class Member {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="MEMBER_ID")
    private Long id;
    private String name;
    private String city;
    private String street;
    private String zipCode;

    @OneToMany(mappedBy = "MEMBER_ID")
    private List<Order> orders = new ArrayList<>();

    @Transient
    private String param; // 임의로 추가해봄

    @Transient
    private String dotori;

    private String totoro;

    private String totoro2;


    @Transient
    private String dodorian1;

    private String temp1;
}
