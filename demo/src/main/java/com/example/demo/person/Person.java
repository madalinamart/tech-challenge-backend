package com.example.demo.person;

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
@Table(name ="Persons")

public class Person {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private Long id;


    @Basic
    @Column(name = "FirstName")
    private String firstName;

    @Basic
    @Column(name = "LastName")
    private String lastName;

    @Basic
    @Column(name = "Gender")
    private String gender;

    @Basic
    @Column(name = "Nationality")
    private String nationality;
    @Basic
    @Column(name = "DateOfBirth")
    private LocalDate dateOfBirth;

    @ManyToOne
    @JoinColumn(name = "IdUser")
    private User idUser;




}
