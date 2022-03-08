package com.example.demo.building;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuildingService {

    public List<Building> getBuildings()
    {
        return List.of(
                new Building(
                        1L,
                        "CladireaA",
                        "Adresa X",
                        13,
                        22
                )
        );
    }
}
