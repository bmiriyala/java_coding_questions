package com.babu.optionalclass;

import java.util.Optional;

/**
 * public T orElseGet(     java.util.function.Supplier<? extends T> supplier )
 *
 * If a value is present, returns the value, otherwise returns the result produced by the supplying function.
 * Params:
 * supplier – the supplying function that produces a value to be returned
 * Returns:
 * the value, if present, otherwise the result produced by the supplying function
 * Throws:
 * NullPointerException – if no value is present and the supplying function is null
 */
public class UseOfOrElseGet {
    public static void main(String[] args) {
        //Option: 1
        //Optional<String> empty = Optional.empty();// gives Optional.empty
        Optional<Employee> empty = Optional.empty();
        System.out.println(empty.orElseGet(Employee::new));

        //Option: 2
        Employee employee = Employee.getEmployee();

        Optional<Employee> emp = Optional.of(employee);//gives Optional[Employee]
        //Optional<Employee> emp = Optional.of(null);//gives NullPointerException
        System.out.println(emp.orElseGet(Employee::new));

        //Option: 3
        Optional<Employee> e = Optional.ofNullable(employee); //gives Optional[Employee]
        //Optional<Employee> e = Optional.ofNullable(null); //gives Optional.empty
        System.out.println(e.orElseGet(Employee::new));
    }
}
