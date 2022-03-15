package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Buildings")

public class Building {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;


    @Basic
    @Column(name = "BuildingName")
    private String buildingName;

    @ManyToOne
    @JoinColumn(name = "IdBuildingAddress")
    private BuildingAddress idBuildingAddress;


    @Basic
    @Column(name = "TotalFloors")
    private int totalFloors;

    @Basic
    @Column(name = "TotalOffices")
    private int totalOffices;

}
