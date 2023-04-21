package com.babu.optionalclass;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * public <U> Optional<U> flatMap(     @NotNull  java.util.function.Function<? super T, ? extends Optional<? extends U>> mapper )
 *
 * If a value is present, returns the result of applying the given Optional-bearing mapping function to the value, otherwise returns an empty Optional.
 * This method is similar to map(Function), but the mapping function is one whose result is already an Optional, and if invoked, flatMap does not wrap it within an additional Optional.
 * Params:
 * mapper – the mapping function to apply to a value, if present
 * Returns:
 * the result of applying an Optional-bearing mapping function to the value of this Optional, if a value is present, otherwise an empty Optional
 * Throws:
 * NullPointerException – if the mapping function is null or returns a null result
 */
public class UseOfFlatMap {
    public static void main(String[] args) {
        Employee employee = Employee.getEmployee();
       Optional<Employee> emp = Optional.ofNullable(employee);
       emp.filter(employee1 -> employee1.getNumberOfProjectsAllocated() > 1)
               .flatMap(Employee::getAddress)
               .ifPresent(System.out::println);

    }
}
