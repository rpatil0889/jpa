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
@Entity
@ToString
@Table(name = "employee__details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name = "employee_name")
    private String employeeName;
    @Column(name = "employee_designation")
    private String designation;
    @Column(name = "employee_contact_number")
    private String contactNumber;

    @OneToOne(mappedBy = "employee",cascade = CascadeType.ALL)
    private Department department;

    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    private List<Laptop> laptop;

    @OneToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    private List<Address> address;

    @ManyToMany(mappedBy = "employee",cascade = CascadeType.ALL)
    private List<Project>projects;
}
