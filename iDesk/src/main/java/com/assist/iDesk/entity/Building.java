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
@Table(name = "Buildings", schema = "public")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

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
