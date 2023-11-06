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
@Table(name = "project_details")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private int projectId;
    @Column(name = "project_name")
    private String projectName;
    @Column(name = "project_client")
    private String clientName;

    @ManyToMany
    @JoinColumn(name = "employee_id")
    private List<Employee> employee;
}
