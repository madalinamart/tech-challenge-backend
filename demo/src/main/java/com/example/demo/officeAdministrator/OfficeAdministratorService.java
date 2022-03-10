package com.example.demo.officeAdministrator;

import com.example.demo.persoana.Persoana;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class OfficeAdministratorService {

    public List<OfficeAdministrator> getOfficeAdministrator()
    {
        return List.of(
                new OfficeAdministrator(
                        1L,
                        "email@yahoo.com",
                        "Maria",
                        "Ionescu",
                        "Inginer(Office admin)",
                        "F",
                        "Italian",
                        LocalDate.of(2000,1,7),
                        22
                )
        );
    }
}
