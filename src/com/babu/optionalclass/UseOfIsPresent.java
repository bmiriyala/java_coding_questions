package com.babu.optionalclass;

import java.util.Optional;

public class UseOfIsPresent {
    public static void main(String[] args) {
        //Option: 1
        //Optional<String> empty = Optional.empty();// gives Optional.empty
        Optional<Employee> empty = Optional.empty();
        if(empty.isPresent()){
            System.out.println(empty.get());
        }

        //Option: 2
        Employee employee = Employee.getEmployee();

        Optional<Employee> emp = Optional.of(employee);//gives Optional[Employee]
        //Optional<Employee> emp = Optional.of(null);//gives NullPointerException

        if(emp.isPresent()){
            System.out.println(emp.get());
        }

        //Option: 3
        Optional<Employee> e = Optional.ofNullable(employee); //gives Optional[Employee]
        //Optional<Employee> e = Optional.ofNullable(null); //gives Optional.empty

        if(e.isPresent()){
            System.out.println(e.get());
        }
    }
}
