package com.assist.iDesk.controller;


import com.assist.iDesk.entity.Building;
import com.assist.iDesk.entity.Office;
import com.assist.iDesk.service.OfficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/office")
public class OfficeController {

    @Autowired
    OfficeService officeService;

    @PostMapping(value ="/add")
    public ResponseEntity addOffice(@RequestBody Office office) {

        return officeService.saveOffice(office);
    }

    @PutMapping(value = "/update/{id}")
    public ResponseEntity updateOffice(@RequestBody Office office, @PathVariable Long id) {

        return officeService.updateOffice(office, id);

    }

    @GetMapping(value = "/list")
    public ResponseEntity getOffices() {

        return officeService.getOffices();
    }
    @GetMapping(value = "/id/{id}")
    public ResponseEntity findOfficeById(@PathVariable Long id) {

        return officeService.getOfficeById(id);
    }
    @DeleteMapping(value = "/delete/{id}")
    public ResponseEntity deleteOffice(@PathVariable Long id) {
        return officeService.deleteOffice(id);
    }


}

