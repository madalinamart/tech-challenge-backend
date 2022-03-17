package com.assist.iDesk.service;

import com.assist.iDesk.entity.Building;
import com.assist.iDesk.entity.Office;
import com.assist.iDesk.repository.OfficeRepository;
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
public class OfficeService {

    @Autowired
    private OfficeRepository officeRepository;

    private String isValidAddOffice(Office office ) {
        String response = "";
        Optional<Office> optOffice = Optional.ofNullable(office);
        if (optOffice.isPresent()) {
            if (officeRepository.findById(office.getId()) == null)
                response += "There is no id <" + office.getId() + "> available.\n";
            if (office.getOfficeName() != null && (office.getOfficeName().length() < 5 || office.getOfficeName().length() > 20))
                response += "The Office Name length should be between 5 and 20 characters.\n";
            if (office.getFloorNumber() <= 0)
                response += "The Floor number should be between 1 and n characters.\n";
            if (office.getIdBuilding() == null)
                response += "Invalid/duplicate building.\n";
            if (office.getTotalDesks() <=0)
                response += "Invalid/duplicate total.\n";
            if (office.getUsableDesks() >office.getTotalDesks())
                response += "Invalid/duplicate usable .\n";

        }
        return response;


    }
    public ResponseEntity saveOffice(Office office){
        String response = isValidAddOffice(office);
        if (response == null || response.equals("")) {
            officeRepository.save(office);
            return new ResponseEntity<>("Office with id <" + office.getId() + "> has been added.", HttpStatus.OK);
        }
        return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
    }

    private String isValidUpdateOffice(Office office) {
        String response = "";
        Optional<Office> optOffice = Optional.ofNullable(office);
        if (optOffice.isPresent()) {
            if (officeRepository.findById(office.getId()) == null)
                response += "There is no id <" + office.getId() + "> available.\n";
            if (office.getOfficeName() != null && (office.getOfficeName().length() < 5 || office.getOfficeName().length() > 20))
                response += "The Office Name length should be between 5 and 20 characters.\n";
            if (office.getFloorNumber() <= 0)
                response += "The Floor number should be between 1 and n characters.\n";
            if (office.getIdBuilding() == null)
                response += "Invalid/duplicate building.\n";
            if (office.getTotalDesks() <=0)
                response += "Invalid/duplicate total.\n";
            if (office.getUsableDesks() >office.getTotalDesks())
                response += "Invalid/duplicate usable .\n";

        }
        return response;
    }

    public ResponseEntity updateOffice(Office office, Long id) {
        Office existingOffice = officeRepository.findById(id).orElse(null);
        String response = isValidUpdateOffice(office);
        if (existingOffice != null) {
            if (response == null || response.equals("")) {
                existingOffice.setOfficeName(office.getOfficeName());
                existingOffice.setFloorNumber(office.getFloorNumber());
                existingOffice.setIdBuilding(office.getIdBuilding());
                existingOffice.setTotalDesks(office.getTotalDesks());
                existingOffice.setUsableDesks(office.getUsableDesks());
                existingOffice.setOfficeAdministrator(office.getOfficeAdministrator());
                officeRepository.save(existingOffice);
                return new ResponseEntity<>("Office with id <" + id + "> has been updated.", HttpStatus.OK);
            }
            return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Can't find office with id <" + id + ">.", HttpStatus.BAD_REQUEST);

    }
    public ResponseEntity getOffices() {
        if (officeRepository.count() == 0)
            return new ResponseEntity<>("There are no offices yet.", HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>(officeRepository.findAll(), HttpStatus.OK);

    }

    public ResponseEntity getOfficeById(Long id) {
        if (officeRepository.findById(id) != null)
            return new ResponseEntity<>(officeRepository.findById(id), HttpStatus.OK);

        return new ResponseEntity<>("There is no registred office with name  <" + id + ">.", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity deleteOffice(Long id) {
        if (officeRepository.existsById(id)) {
            officeRepository.deleteById(id);
            return new ResponseEntity<>("Office with id <" + id + "> has been removed.", HttpStatus.OK);
        }
        return new ResponseEntity<>("Can't find office with id <" + id + ">.", HttpStatus.BAD_REQUEST);
    }


}

