package com.example.demo.persoana;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/persoana")
//API LAYER
public class PersoanaController {

    private final PersoanaService persoanaService;

    @Autowired
    public PersoanaController(PersoanaService persoanaService) {
        this.persoanaService = persoanaService;
    }

    @GetMapping
    public List<Persoana> getPersoane()
    {
        return persoanaService.getPersoane();
    }
}
