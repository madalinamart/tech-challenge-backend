package com.example.demo.employee;

import com.example.demo.persoana.Persoana;

import java.time.LocalDate;

public class Employee extends Persoana {

    public Employee() {
    }

    public Employee(Long idPersoana,
                    String emailPersoana,
                    String firstName,
                    String lastName,
                    String rolePersoana,
                    String gender,
                    String nationality,
                    LocalDate dateOfBirth,
                    int agePersoana)
    {
        super(idPersoana, emailPersoana, firstName, lastName, rolePersoana, gender, nationality, dateOfBirth, agePersoana);
    }

    public Employee(String emailPersoana,
                    String firstName,
                    String lastName,
                    String rolePersoana,
                    String gender,
                    String nationality,
                    LocalDate dateOfBirth,
                    int agePersoana)
    {
        super(emailPersoana, firstName, lastName, rolePersoana, gender, nationality, dateOfBirth, agePersoana);
    }
}
