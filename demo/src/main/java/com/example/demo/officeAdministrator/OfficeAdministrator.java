package com.example.demo.officeAdministrator;

import com.example.demo.persoana.Persoana;

import java.time.LocalDate;

public class OfficeAdministrator extends Persoana {

    public OfficeAdministrator() {
    }

    public OfficeAdministrator(Long idPersoana,
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

    public OfficeAdministrator(String emailPersoana,
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
