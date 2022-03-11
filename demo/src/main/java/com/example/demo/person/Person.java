package com.example.demo.person;

import com.example.demo.user.User;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="Persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String FirstName;
    private String LastName;
    private LocalDate DateOfBirth;
    private String Gender;
    private String Nationality;
    @ManyToOne
    @JoinColumn(name = "id_user_id")
    private User IdUser;

    public User getIdUser() {
        return IdUser;
    }


    public Person() {
    }

    public Person(Long id,
                  String firstName,
                  String lastName,
                  LocalDate dateOfBirth,
                  String gender,
                  String nationality) {
        Id = id;
        FirstName = firstName;
        LastName = lastName;
        DateOfBirth = dateOfBirth;
        Gender = gender;
        Nationality = nationality;
    }

    @Id
    @Column(name="ID")
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    @Basic
    @Column(name = "FirstName",nullable = false)
     public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    @Basic
    @Column(name = "LastName",nullable = false)
    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    @Basic
    @Column(name = "Gender",nullable = false)
    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @Basic
    @Column(name = "Nationality",nullable = true)
    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }
    @Basic
    @Column(name = "DateOfBirth",nullable = true)
    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                ", Gender='" + Gender + '\'' +
                ", Nationality='" + Nationality + '\'' +
                ", IdUser=" + IdUser +
                '}';
    }
}
