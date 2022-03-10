package com.example.demo.employee;

import com.example.demo.persoana.Persoana;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmployee()
    {
        return List.of(
                new Employee(
                        1L,
                        "email@yahoo.com",
                        "Maria",
                        "Ionescu",
                        "Inginer(employee)",
                        "F",
                        "Italian",
                        LocalDate.of(2000,1,7),
                        22
                )
        );
    }
}
