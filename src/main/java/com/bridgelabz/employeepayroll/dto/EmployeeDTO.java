package com.bridgelabz.employeepayroll.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor



public @ToString  class EmployeeDTO {
    public String name;
    public double salary;
    @Pattern(regexp = "male|female",message = "choose either male or female")
    public String gender;
//    @JsonFormat(pattern = "yyyy-MM-dd")
    public LocalDate startDate;
    @NotBlank(message = "Department should not be empty")
    public String department;
    public long id;

}
