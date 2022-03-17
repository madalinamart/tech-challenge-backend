package com.assist.iDesk.service;

import com.assist.iDesk.entity.Building;
import com.assist.iDesk.entity.User;
import com.assist.iDesk.repository.BuildingRepository;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
@RequiredArgsConstructor
@Setter
@Transactional
public class BuildindService {

    @Autowired
    private BuildingRepository buildingRepository;

    private String isValidAddBuilding(Building building ) {
        String response = "";
        Optional<Building> optBuilding = Optional.ofNullable(building);
        if (optBuilding.isPresent()) {
            if (buildingRepository.findById(building.getId()) == null)
                response += "There is no id <" + building.getId() + "> available.\n";
            if (building.getBuildingName() != null && (building.getBuildingName().length() < 5 || building.getBuildingName().length() > 20))
                response += "The Building Name length should be between 5 and 20 characters.\n";
            if (building.getTotalFloors() <= 0)
                response += "The Floor number should be between 1 and n characters.\n";
            if (building.getIdBuildingAddress() != null)
                response += "Invalid/duplicate address.\n";
        }
            return response;


    }
    public ResponseEntity saveBuilding(Building building){
        String response = isValidAddBuilding(building);
        if (response == null || response.equals("")) {
            buildingRepository.save(building);
            return new ResponseEntity<>("Building with id <" + building.getId() + "> has been added.", HttpStatus.OK);
        }
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    private String isValidUpdateBuilding(Building building) {
        String response = "";
        Optional<Building> optBuilding = Optional.ofNullable(building);
        if (optBuilding.isPresent()) {
            if (building.getBuildingName() != null && (building.getBuildingName().length() < 5 || building.getBuildingName().length() > 20))
                response += "The first name length should be between 5 and 20 characters.\n";
            if (building.getTotalFloors() <= 0)
                response += "The Floor number should be between 1 and n characters.\n";
            if (building.getIdBuildingAddress() != null)
                response += "Invalid/duplicate address.\n"; }
        return response;
    }

    public ResponseEntity updateBuilding(Building building, Long id) {
        Building existingBuilding = buildingRepository.findById(id).orElse(null);
        String response = isValidUpdateBuilding(building);
        if (existingBuilding != null) {
            if (response == null || response.equals("")) {
                existingBuilding.setBuildingName(building.getBuildingName());
                existingBuilding.setTotalFloors(building.getTotalFloors());
                existingBuilding.setIdBuildingAddress(building.getIdBuildingAddress());
                buildingRepository.save(existingBuilding);
                return new ResponseEntity<>("Building with id <" + id + "> has been updated.", HttpStatus.OK);
            }
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Can't find building with id <" + id + ">.", HttpStatus.BAD_REQUEST);

    }
    public ResponseEntity getBuildings() {
        if (buildingRepository.count() == 0)
            return new ResponseEntity<>("There are no buildings yet.", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(buildingRepository.findAll(), HttpStatus.OK);

    }

    public ResponseEntity getBuildingByName(String buildingName) {
        if (buildingRepository.findByBuildingName(buildingName) != null)
            return new ResponseEntity<>(buildingRepository.findByBuildingName(buildingName), HttpStatus.OK);

        return new ResponseEntity<>("There is no registred building with name  <" + buildingName + ">.", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity deleteBuilding(Long id) {
        if (buildingRepository.existsById(id)) {
            buildingRepository.deleteById(id);
            return new ResponseEntity<>("Building with id <" + id + "> has been removed.", HttpStatus.OK);
        }
        return new ResponseEntity<>("Can't find building with id <" + id + ">.", HttpStatus.BAD_REQUEST);
    }


}
