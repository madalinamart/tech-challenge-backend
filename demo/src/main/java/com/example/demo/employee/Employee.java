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
                    LocalDate dateOfBirth)
    {
        super(idPersoana, emailPersoana, firstName, lastName, rolePersoana, gender, nationality, dateOfBirth);
    }

    public Employee(String emailPersoana,
                    String firstName,
                    String lastName,
                    String rolePersoana,
                    String gender,
                    String nationality,
                    LocalDate dateOfBirth)
    {
        super(emailPersoana, firstName, lastName, rolePersoana, gender, nationality, dateOfBirth);
    }
}
