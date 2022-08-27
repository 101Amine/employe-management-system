package com.gutsdailyC.employesystemapi.model;


import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
    private String emailId;



}
