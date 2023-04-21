package com.babu.optionalclass;

import java.util.Optional;

/**
 * public void ifPresent(     java.util.function.Consumer<? super T> action )
 *
 * If a value is present, performs the given action with the value, otherwise does nothing.
 * Params:
 *  action – the action to be performed, if a value is present
 *  Throws: NullPointerException – if value is present and the given action is null
 */
public class UseOfIfPresent {
    public static void main(String[] args) {
        //Option: 1
        //Optional<String> empty = Optional.empty();// gives Optional.empty
        Optional<Employee> empty = Optional.empty();
        empty.ifPresent(System.out::println);

        //Option: 2
        Employee employee = Employee.getEmployee();

        Optional<Employee> emp = Optional.of(employee);//gives Optional[Employee]
        //Optional<Employee> emp = Optional.of(null);//gives NullPointerException
        emp.ifPresent(System.out::println);

        //Option: 3
        Optional<Employee> e = Optional.ofNullable(employee); //gives Optional[Employee]
        //Optional<Employee> e = Optional.ofNullable(null); //gives Optional.empty
        e.ifPresent(System.out::println);
    }
}
