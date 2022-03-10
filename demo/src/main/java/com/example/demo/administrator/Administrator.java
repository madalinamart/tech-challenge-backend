package com.example.demo.administrator;

import com.example.demo.persoana.Persoana;

import java.time.LocalDate;

public class Administrator extends Persoana {

    public Administrator() {
    }

    public Administrator(Long idPersoana, String emailPersoana, String firstName, String lastName, String rolePersoana, String gender, String nationality, LocalDate dateOfBirth, int agePersoana) {
        super(idPersoana, emailPersoana, firstName, lastName, rolePersoana, gender, nationality, dateOfBirth, agePersoana);
    }

    public Administrator(String emailPersoana, String firstName, String lastName, String rolePersoana, String gender, String nationality, LocalDate dateOfBirth, int agePersoana) {
        super(emailPersoana, firstName, lastName, rolePersoana, gender, nationality, dateOfBirth, agePersoana);
    }
}
