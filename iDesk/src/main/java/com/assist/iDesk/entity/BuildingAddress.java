package com.assist.iDesk.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;
@Data
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BuildingAdresses", schema = "public")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public class BuildingAddress {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;


    @Basic
    @Column(name = "Province")
    private String province;


    @Basic
    @Column(name = "City")
    private String city;

    @Basic
    @Column(name = "Street")
    private String street;


    @Basic
    @Column(name = "Number")
    private int number;

}
