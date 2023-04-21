package com.babu.optionalclass;

import java.util.Optional;

/**
 *
 * public void ifPresentOrElse(     java.util.function.Consumer<? super T> action,
 *     Runnable emptyAction )
 *
 * If a value is present, performs the given action with the value, otherwise performs the given empty-based action.
 * Params:
 * action – the action to be performed, if a value is present emptyAction – the empty-based action to be performed, if no value is present
 * Throws:
 * NullPointerException – if a value is present and the given action is null, or no value is present and the given empty-based action is null.
 */
public class IfPresentOrElse {

    public static void main(String[] args) {
        Employee employee = Employee.getEmployee();
        //Employee employee = null;

        Optional<Employee> emp = Optional.ofNullable(employee);

        emp.ifPresentOrElse(System.out::println, () -> System.out.println("No value or Null value present"));
    }
}
