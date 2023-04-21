package com.babu.optionalclass;

import java.util.Optional;

public class WaysToCreateOptional {
    public static void main(String[] args) {
        //ways to create Optional class

        //Option: 1
        //Optional<String> empty = Optional.empty();// gives Optional.empty
        Optional<Employee> empty = Optional.empty();
        System.out.println(empty);

        //Option: 2
        Employee employee = Employee.getEmployee();

        Optional<Employee> emp = Optional.of(employee);//gives Optional[Employee]
        //Optional<Employee> emp = Optional.of(null);//gives NullPointerException
        System.out.println(emp);

        //Option: 3
        //Optional<Employee> e = Optional.ofNullable(employee); //gives Optional[Employee]
        Optional<Employee> e = Optional.ofNullable(null); //gives Optional.empty
        System.out.println(e);

    }
}
