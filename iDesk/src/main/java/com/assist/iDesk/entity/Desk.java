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
@Table(name = "Desks", schema = "public")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

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