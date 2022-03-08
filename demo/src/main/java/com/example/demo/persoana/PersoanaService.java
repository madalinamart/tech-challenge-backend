package com.example.demo.persoana;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

//@Component
//SERVICE LAYER
@Service
public class PersoanaService {

    public List<Persoana> getPersoane()
    {
        return List.of(
                new Persoana(
                        1L,
                        "email@yahoo.com",
                        "Maria",
                        "Ionescu",
                        "Inginer",
                        "F",
                        "Italian",
                        LocalDate.of(2000,1,7),
                        22
                )
        );
    }
}
