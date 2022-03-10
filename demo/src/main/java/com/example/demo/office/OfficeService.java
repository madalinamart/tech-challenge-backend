package com.example.demo.office;

import com.example.demo.persoana.Persoana;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OfficeService {

    public List<Office> getOffice()
    {
        return List.of(
                new Office(
                        "Office building",
                        1L,
                        5,
                        "office name",
                        false
                )
        );
    }
}
