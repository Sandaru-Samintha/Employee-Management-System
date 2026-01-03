package com.example.EmployeeManagementSystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name ="Employee")  // give the table name
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // we use for this auto generate the primary key of empID
    private int empID;
    private String empName;
    private String empAddress;
    private  String empMNumber;
}
