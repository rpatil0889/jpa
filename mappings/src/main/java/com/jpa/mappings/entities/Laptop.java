package com.jpa.mappings.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "laptop_details")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int laptopId;
    @Column(name = "laptop_brand")
    private String laptopBrand;
    @Column(name = "laptop_model")
    private String laptopModel;
    @Column(name = "laptop_os")
    private String laptopOS;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
