package com.example.demo.office;

import com.example.demo.building.Building;
import com.example.demo.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Offices")

public class Office {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;


    @Basic
    @Column(name = "OfficeName")
    private String officeName;

    @ManyToOne
    @JoinColumn(name = "IdBuilding")
    private Building idBuilding;


    @Basic
    @Column(name = "FloorNumber")
    private int floorNumber;

    @Basic
    @Column(name = "TotalDesks")
    private int totalDesks;

    @Basic
    @Column(name = "UsableDesks")
    private int usableDesks;
    @Basic
    @Column(name = "OfficeAdministrator")
    private String officeAdministrator;




}
