package com.jpa.mappings;

import com.jpa.mappings.entities.*;
import com.jpa.mappings.repositories.EmployeeRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@Slf4j
public class MappingsApplication implements CommandLineRunner {
	@Autowired
	EmployeeRepo employeeRepo;

	public static void main(String[] args) {
		SpringApplication.run(MappingsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setEmployeeName("Test_EMP");
		employee.setDesignation("Software Engineer");
		employee.setContactNumber("12345678890");

		Department department= new Department();
		department.setDepartmentName("JAVA-WEB");
		department.setWorking("Fullstack");
		department.setEmployee(employee);

		Address address1 = new Address();
		address1.setCity("SN");
		address1.setState("MH");
		address1.setZipCode("123456");
		address1.setCountry("IN");
		address1.setEmployee(employee);

		Address address2 = new Address();
		address2.setCity("PN");
		address2.setState("MH");
		address2.setZipCode("4567890");
		address2.setCountry("IN");
		address2.setEmployee(employee);


		Laptop laptop1 = new Laptop();
		laptop1.setLaptopBrand("HP");
		laptop1.setLaptopModel("BA075TX");
		laptop1.setLaptopOS("Windows");
		laptop1.setEmployee(employee);

		Laptop laptop2 = new Laptop();
		laptop2.setLaptopBrand("Apple");
		laptop2.setLaptopModel("MacBook Pro");
		laptop2.setLaptopOS("Mac OS");
		laptop2.setEmployee(employee);

		Project project1 = new Project();
		project1.setProjectName("E-Commerce");
		project1.setClientName("Test_Client");
		project1.setEmployee(List.of(employee));

		Project project2 = new Project();
		project2.setProjectName("Banking");
		project2.setClientName("Test_Client");
		project2.setEmployee(List.of(employee));

		employee.setDepartment(department);
		employee.setAddress(List.of(address1,address2));
		employee.setLaptop(List.of(laptop1,laptop2));
		employee.setProjects(List.of(project1,project2));

		Employee emp = employeeRepo.save(employee);

	}
}
