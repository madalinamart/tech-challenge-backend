package com.example.demo.desk;

import com.example.demo.persoana.Persoana;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DeskService {

    public List<Desk> getDesk()
    {
        return List.of(
                new Desk(
                        3L,
                        "name of parent office",
                        true
                )
        );
    }
}
