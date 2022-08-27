package com.gutsdailyC.employesystemapi.controller;

import com.gutsdailyC.employesystemapi.model.Employee;
import com.gutsdailyC.employesystemapi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController  {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("employees")
    public Employee createEmpoyee (@RequestBody Employee employee) {
       return  employeeService.createEmployee(employee);

    }
}
