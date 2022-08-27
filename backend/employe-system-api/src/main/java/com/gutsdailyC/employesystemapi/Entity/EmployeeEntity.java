package com.gutsdailyC.employesystemapi.Entity;


import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Entity
@Data
@Table(name= "employees")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String firstName;
    private String lastName;
    private String emailId;



}
