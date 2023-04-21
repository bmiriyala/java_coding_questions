package com.babu.optionalclass;

import java.math.BigDecimal;
import java.util.Optional;

/**
 * public <U> Optional<U> map(     @NotNull  java.util.function.Function<? super T, ? extends U> mapper )
 *
 * If a value is present, returns an Optional describing (as if by ofNullable) the result of applying the given mapping function to the value, otherwise returns an empty Optional.
 * If the mapping function returns a null result then this method returns an empty Optional.
 * Params:
 * mapper – the mapping function to apply to a value, if present
 * Returns:
 * an Optional describing the result of applying a mapping function to the value of this Optional, if a value is present, otherwise an empty Optional
 * Throws:
 * NullPointerException – if the mapping function is null
 * API Note:
 * This method supports post-processing on Optional values, without the need to explicitly check for a return status. For example, the following code traverses a stream of URIs, selects one that has not yet been processed, and creates a path from that URI, returning an Optional<Path>:
 *  Optional<Path> p =      uris.stream().filter(uri -> !isProcessedYet(uri))                    .findFirst()                    .map(Paths::get);
 * Here, findFirst returns an Optional<URI>, and then map returns an Optional<Path> for the desired URI if one exists.
 */
public class UseOfMap {
    public static void main(String[] args) {
        //Option: 1
        //Optional<String> empty = Optional.empty();// gives Optional.empty
        Optional<Employee> empty = Optional.empty();
        System.out.println(empty.map(emp -> emp.getSalary().add(BigDecimal.valueOf(10000.00))));

        //Option: 2
        Employee employee = Employee.getEmployee();

        Optional<Employee> emp = Optional.of(employee);//gives Optional[Employee]
        //Optional<Employee> emp = Optional.of(null);//gives NullPointerException
        System.out.println(emp.map(emp2 -> emp2.getSalary().add(BigDecimal.valueOf(10000.00))).get());

        //Option: 3
        Optional<Employee> e = Optional.ofNullable(employee); //gives Optional[Employee]
        //Optional<Employee> e = Optional.ofNullable(null); //gives Optional.empty
        System.out.println(e.map(emp3 -> emp3.getSalary().add(BigDecimal.valueOf(10000.00))));
    }
}
