package com.example.demo.desk;

import com.example.demo.building.Building;
import com.example.demo.office.Office;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Desks")

public class Desk {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;


    @Basic
    @Column(name = "DeskName")
    private String deskName;

    @Basic
    @Column(name = "Vacancy")
    private int floorNumber;

    @ManyToOne
    @JoinColumn(name = "IdOffice")
    private Office idOffice;









}