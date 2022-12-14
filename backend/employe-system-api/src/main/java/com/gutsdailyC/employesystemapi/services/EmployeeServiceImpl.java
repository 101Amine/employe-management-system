package com.gutsdailyC.employesystemapi.services;


import com.gutsdailyC.employesystemapi.Entity.EmployeeEntity;
import com.gutsdailyC.employesystemapi.Repository.EmployeeRepository;
import com.gutsdailyC.employesystemapi.model.Employee;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;


    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    @Override
    public Employee createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = null;

        BeanUtils.copyProperties( employee, employeeEntity);

        employeeRepository.save(employeeEntity);

        return employee;
    }
}
