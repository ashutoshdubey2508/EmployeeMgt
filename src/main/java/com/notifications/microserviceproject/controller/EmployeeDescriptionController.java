package com.notifications.microserviceproject.controller;

import com.notifications.microserviceproject.RequestData;
import com.notifications.microserviceproject.entity.EmployeeDescription;
import com.notifications.microserviceproject.service.EmployeeDescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin
@RequestMapping("/")

public class EmployeeDescriptionController {

    private final EmployeeDescriptionService employeeDescriptionService;

    @Autowired
    public EmployeeDescriptionController(EmployeeDescriptionService employeeDescriptionService) {
        this.employeeDescriptionService = employeeDescriptionService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/get")
    public List<EmployeeDescription> getAllEmployeeDescriptions() {
        return employeeDescriptionService.getAllEmployeeDescriptions();
    }

    @PostMapping("/add")
    public int addEmployeeDescription(@RequestBody RequestData requestData) {
        if(requestData.getEmployeeId()==0) return 1;
        return employeeDescriptionService.addEmployeeDescription(requestData);
    }


//    @PostMapping("/add")
//    public int addEmployeeDescription(@PathVariable int employeeId, @PathVariable String description) {
//        return employeeDescriptionService.addEmployeeDescription(employeeId, description);
//    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployeeDescriptionById(@PathVariable int id) {
        employeeDescriptionService.deleteEmployeeDescriptionById(id);
    }
}
