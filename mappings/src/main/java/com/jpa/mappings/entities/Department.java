package com.jpa.mappings.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "department_details")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;
    private String departmentName;
    private String working;

    @OneToOne()
    @JoinColumn(name = "employee_id")
    private Employee employee;

//    @OneToMany
//    private List<Laptop> laptop;
}
