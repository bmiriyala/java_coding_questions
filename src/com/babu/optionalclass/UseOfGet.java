package com.babu.optionalclass;

import java.util.Optional;

/**
 * If a value is present, returns the value, otherwise throws NoSuchElementException.
 */
public class UseOfGet {
    public static void main(String[] args) {

        //Option: 1
        Optional<Employee> empty = Optional.empty();
        //System.out.println(empty.get()); // java.util.NoSuchElementException: No value present

        //Option: 2
        Employee employee = Employee.getEmployee();

        Optional<Employee> emp = Optional.of(employee);//gives Optional[Employee]
        //Optional<Employee> emp = Optional.of(null);//gives NullPointerException
        System.out.println(emp.get()); //gives Employee object

        //Option: 3
        Optional<Employee> e = Optional.ofNullable(employee); //gives Optional[Employee]
        //Optional<Employee> e = Optional.ofNullable(null); //gives Optional.empty
        System.out.println(e.get()); //gives Employee object
    }
}
