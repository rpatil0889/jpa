package com.jpa.mappings.exception;

public class EmployeeNotFound extends RuntimeException{
    public EmployeeNotFound(){
        super("Resource Not Found in DB");
    }
    public EmployeeNotFound(String msg){
        super(msg);
    }
}
