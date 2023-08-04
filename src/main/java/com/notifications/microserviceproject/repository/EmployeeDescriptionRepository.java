package com.notifications.microserviceproject.repository;

import com.notifications.microserviceproject.entity.EmployeeDescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDescriptionRepository extends JpaRepository<EmployeeDescription, Integer> {
}
