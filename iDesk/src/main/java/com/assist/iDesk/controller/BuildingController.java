package com.assist.iDesk.controller;

import com.assist.iDesk.entity.Building;
import com.assist.iDesk.entity.User;
import com.assist.iDesk.service.BuildindService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/building")
public class BuildingController {

    @Autowired
    BuildindService buildingService;

    @PostMapping(value ="/add")
    public ResponseEntity addBuilding(@RequestBody Building building) {

        return buildingService.saveBuilding(building);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity updateBuilding(@RequestBody Building building, @PathVariable Long id) {

        return buildingService.updateBuilding(building, id);

    }

    @GetMapping(value = "/list")
    public ResponseEntity getBuildings() {

        return buildingService.getBuildings();
    }
    @GetMapping(value = "/name")
    public ResponseEntity findBuildingByName(@PathVariable String buildingName) {

        return buildingService.getBuildingByName(buildingName);
    }

}
