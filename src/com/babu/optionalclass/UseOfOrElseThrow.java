package com.babu.optionalclass;

import java.util.Optional;

/**
 * public <X extends Throwable> T orElseThrow(     java.util.function.Supplier<? extends X> exceptionSupplier )
 * throws X
 *
 * If a value is present, returns the value, otherwise throws an exception produced by the exception supplying function.
 * Params:
 * exceptionSupplier – the supplying function that produces an exception to be thrown
 * Returns:
 * the value, if present
 * Throws:
 * X – if no value is present
 * NullPointerException – if no value is present and the exception supplying function is null
 * API Note:
 * A method reference to the exception constructor with an empty argument list can be used as the supplier. For example, IllegalStateException::new
 */
public class UseOfOrElseThrow {
    public static void main(String[] args) {
        //Option: 1
        //Optional<String> empty = Optional.empty();// gives Optional.empty
        Optional<Employee> empty = Optional.empty();
        System.out.println(empty.orElseThrow(() -> new IllegalStateException("No value or Null value present")));
        //System.out.println(empty.orElseThrow(() -> null)); // gives NPE if supplier is null

        //Option: 2
        Employee employee = Employee.getEmployee();

        Optional<Employee> emp = Optional.of(employee);//gives Optional[Employee]
        //Optional<Employee> emp = Optional.of(null);//gives NullPointerException
        System.out.println(emp.orElseThrow(() -> new IllegalStateException("No value or Null value present")));

        //Option: 3
        //Optional<Employee> e = Optional.ofNullable(employee); //gives Optional[Employee]
        Optional<Employee> e = Optional.ofNullable(null); //gives Optional.empty
        System.out.println(e.orElseThrow(() -> new IllegalStateException("No value or Null value present")));
    }
}
