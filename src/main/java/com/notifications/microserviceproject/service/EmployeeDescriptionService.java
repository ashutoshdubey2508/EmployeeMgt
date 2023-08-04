package com.notifications.microserviceproject.service;
import com.notifications.microserviceproject.RequestData;
import com.notifications.microserviceproject.entity.EmployeeDescription;
import com.notifications.microserviceproject.repository.EmployeeDescriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeDescriptionService {

    private final EmployeeDescriptionRepository employeeDescriptionRepository;

    @Autowired
    public EmployeeDescriptionService(EmployeeDescriptionRepository employeeDescriptionRepository) {
        this.employeeDescriptionRepository = employeeDescriptionRepository;
    }


    public int addEmployeeDescription(RequestData requestData) {
        int employeeId = requestData.getEmployeeId();
        String description = requestData.getDescription();
//        System.out.println(description);
//        System.out.println(employeeId);
        if(employeeId == 0) return 1;
        EmployeeDescription employeeDescription = new EmployeeDescription();
        employeeDescription.setEmployeeId(employeeId);
        employeeDescription.setDescription(description);
        EmployeeDescription savedEmployeeDescription = employeeDescriptionRepository.save(employeeDescription);
        return savedEmployeeDescription.getId();
    }

//    public int addEmployeeDescription(int employeeId, String description) {
//        EmployeeDescription employeeDescription = new EmployeeDescription();
//        employeeDescription.setEmployeeId(employeeId);
//        employeeDescription.setDescription(description);
//        EmployeeDescription savedEmployeeDescription = employeeDescriptionRepository.save(employeeDescription);
//        return savedEmployeeDescription.getId();
//    }

    public void deleteEmployeeDescriptionById(int id) {
        employeeDescriptionRepository.deleteById(id);
    }

    public List<EmployeeDescription> getAllEmployeeDescriptions() {
        return employeeDescriptionRepository.findAll();
    }
}
