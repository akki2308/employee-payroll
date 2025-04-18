package com.bridgelabz.employeepayroll.model;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public @ToString  class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long employeeId;
    private String name;
    private double salary;

    @Pattern(regexp ="male|female",message="select either from male or female")
    private String gender;
    private LocalDate startDate;
    private String department;

    public Employee(EmployeeDTO employeeDTO) {
     this.name=employeeDTO.name;
     this.salary=employeeDTO.salary;
     this.gender=employeeDTO.gender;
     this.startDate=employeeDTO.startDate;
     this.department=employeeDTO.department;
     this.employeeId= employeeDTO.id;
    }
}
