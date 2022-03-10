package com.example.demo.officeAdministrator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/officeAdministrator")
public class OfficeAdministratorController {

    private final OfficeAdministratorService officeAdministratorService;

    @Autowired
    public OfficeAdministratorController(OfficeAdministratorService officeAdministratorService) {
        this.officeAdministratorService = officeAdministratorService;
    }

    @GetMapping
    public List<OfficeAdministrator> getOfficeAdministrators()
    {
        return officeAdministratorService.getOfficeAdministrator();
    }
}
