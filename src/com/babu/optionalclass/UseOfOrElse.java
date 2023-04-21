package com.babu.optionalclass;

import java.util.Optional;

/**
 * public T orElse(     @Nullable  T other )
 *
 * If a value is present, returns the value, otherwise returns other.
 * Params:
 * other – the value to be returned, if no value is present. May be null.
 */
public class UseOfOrElse {
    public static void main(String[] args) {
        //Option: 1
        //Optional<String> empty = Optional.empty();// gives Optional.empty
        Optional<Employee> empty = Optional.empty();
        System.out.println(empty.orElse(new Employee()));

        //Option: 2
        Employee employee = Employee.getEmployee();

        Optional<Employee> emp = Optional.of(employee);//gives Optional[Employee]
        //Optional<Employee> emp = Optional.of(null);//gives NullPointerException
        System.out.println(emp.orElse(new Employee()));

        //Option: 3
        //Optional<Employee> e = Optional.ofNullable(employee); //gives Optional[Employee]
        Optional<Employee> e = Optional.ofNullable(null); //gives Optional.empty
        System.out.println(e.orElse(new Employee()));
    }
}
