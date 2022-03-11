package com.example.demo.person;

import com.example.demo.user.User;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name ="Persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String nationality;

    public Person() {
    }

    public Person(Long id,
                  String firstName,
                  String lastName,
                  LocalDate dateOfBirth,
                  String gender,
                  String nationality) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.nationality = nationality;
    }

    @Id
    @Column(name="ID")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FirstName")
     public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    @Basic
    @Column(name = "LastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "Gender")
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "Nationality")
    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    @Basic
    @Column(name = "DateOfBirth")
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @ManyToOne
    @JoinColumn(name = "IdUser")
    private User IdUser;

    public User getIdUser() {
        return IdUser;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + id +
                ", FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", DateOfBirth=" + dateOfBirth +
                ", Gender='" + gender + '\'' +
                ", Nationality='" + nationality + '\'' +
                ", IdUser=" + IdUser +
                '}';
    }
}
