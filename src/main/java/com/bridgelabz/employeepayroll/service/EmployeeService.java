//package com.bridgelabz.employeepayroll.service;
//
//import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
//import com.bridgelabz.employeepayroll.model.Employee;
//import com.bridgelabz.employeepayroll.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class EmployeeService implements IEmployeeService {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//
//    @Override
//    public Employee createEmployee(EmployeeDTO employeeDTO) {
//        Employee employee = new Employee();
//        employee.setName(employeeDTO.getName());
//        employee.setSalary(employeeDTO.getSalary());
//        return employeeRepository.save(employee);
//    }
//
//    @Override
//    public List<Employee> getAllEmployees() {
//        return employeeRepository.findAll();
//    }
//
//    @Override
//    public Employee getEmployeeById(Long id) {
//        return employeeRepository.findById(id).orElseThrow(()-> new RuntimeException("Employee not found with ID: " + id));
//    }
//
//    @Override
//    public Employee updateEmployee(Long id, EmployeeDTO employeeDTO) {
//        Employee employee = getEmployeeById(id);
//        employee.setName(employeeDTO.getName());
//        employee.setSalary(employeeDTO.getSalary());
//        return employeeRepository.save(employee);
//    }
//
//    @Override
//    public void deleteEmployee(Long id) {
//        employeeRepository.deleteById(id);
//    }
//
//
//}

package com.bridgelabz.employeepayroll.service;

import com.bridgelabz.employeepayroll.dto.EmployeeDTO;
import com.bridgelabz.employeepayroll.model.Employee;
import com.bridgelabz.employeepayroll.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Slf4j
@Service
public class EmployeeService implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(EmployeeDTO employeeDTO) {
//        Employee employee = new Employee();
//        employee.setName(employeeDTO.getName());
//        employee.setSalary(employeeDTO.getSalary());
//        employee.setGender(employeeDTO.getGender());
//        employee.setStartDate(employeeDTO.getStartDate());
//        employee.setDepartment(employeeDTO.getDepartment());
        Employee empData=new Employee(employeeDTO);
        log.debug("empData:{}",empData.toString());
        log.info("this is my data we are using happy to see");
        log.error("this is error");
//        log.atWarn();
        return employeeRepository.save(empData);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee not found with ID: " + id));
    }

    @Override
    public Employee updateEmployee(Long id, EmployeeDTO employeeDTO) {
        Employee employee = getEmployeeById(id);
        employee.setName(employeeDTO.getName());
        employee.setSalary(employeeDTO.getSalary());
        employee.setGender(employeeDTO.getGender());
        employee.setStartDate(employeeDTO.getStartDate());
        employee.setDepartment(employeeDTO.getDepartment());
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}

