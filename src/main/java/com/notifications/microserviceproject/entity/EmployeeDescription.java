package com.notifications.microserviceproject.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="EmployeeDescription")
public class EmployeeDescription {
    @Id
    @GeneratedValue
    private int Id;
    private int employeeId;
    private String description;
}
