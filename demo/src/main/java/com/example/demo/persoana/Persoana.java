package com.example.demo.persoana;

import java.time.LocalDate;

public class Persoana {
    private Long IdPersoana;
    private String EmailPersoana;
    private String FirstName;
    private String LastName;
    private String RolePersoana;
    private String Gender;
    private String Nationality;
    private LocalDate DateOfBirth;
    private int AgePersoana;

    public Persoana() {
    }

    public Persoana(Long idPersoana,
                    String emailPersoana,
                    String firstName,
                    String lastName,
                    String rolePersoana,
                    String gender,
                    String nationality,
                    LocalDate dateOfBirth,
                    int agePersoana)
    {
        IdPersoana = idPersoana;
        EmailPersoana = emailPersoana;
        FirstName = firstName;
        LastName = lastName;
        RolePersoana = rolePersoana;
        Gender = gender;
        Nationality = nationality;
        DateOfBirth = dateOfBirth;
        AgePersoana = agePersoana;
    }

    public Persoana(String emailPersoana,
                    String firstName,
                    String lastName,
                    String rolePersoana,
                    String gender,
                    String nationality,
                    LocalDate dateOfBirth,
                    int agePersoana)
    {
        EmailPersoana = emailPersoana;
        FirstName = firstName;
        LastName = lastName;
        RolePersoana = rolePersoana;
        Gender = gender;
        Nationality = nationality;
        DateOfBirth = dateOfBirth;
        AgePersoana = agePersoana;
    }

    public Long getIdPersoana() {
        return IdPersoana;
    }

    public void setIdPersoana(Long idPersoana) {
        IdPersoana = idPersoana;
    }

    public String getEmailPersoana() {
        return EmailPersoana;
    }

    public void setEmailPersoana(String emailPersoana) {
        EmailPersoana = emailPersoana;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getRolePersoana() {
        return RolePersoana;
    }

    public void setRolePersoana(String rolePersoana) {
        RolePersoana = rolePersoana;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public LocalDate getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public int getAgePersoana() {
        return AgePersoana;
    }

    public void setAgePersoana(int agePersoana) {
        AgePersoana = agePersoana;
    }

    @Override
    public String toString() {
        return "Persoana{" +
                "IdPersoana=" + IdPersoana +
                ", EmailPersoana='" + EmailPersoana + '\'' +
                ", FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", RolePersoana='" + RolePersoana + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Nationality='" + Nationality + '\'' +
                ", DateOfBirth=" + DateOfBirth +
                ", AgePersoana=" + AgePersoana +
                '}';
    }
}
