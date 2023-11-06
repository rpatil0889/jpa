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
@Table(name = "address_details")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

}
