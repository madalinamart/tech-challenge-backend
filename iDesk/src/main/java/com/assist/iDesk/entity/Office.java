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
@Table(name = "Offices", schema = "public")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

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
