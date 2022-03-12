package com.example.demo.administrator;

import com.example.demo.persoana.Persoana;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AdministratorService {

    public List<Administrator> getAdministrator()
    {
        return List.of(
                new Administrator(
                        1L,
                        "email@yahoo.com",
                        "Maria",
                        "Ionescu",
                        "Inginer(Administrator)",
                        "F",
                        "Italian",
                        LocalDate.of(2000,1,7)
                )
        );
    }
}
