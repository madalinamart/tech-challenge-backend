package com.assist.iDesk.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Buildings")

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
