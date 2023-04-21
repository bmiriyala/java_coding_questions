package com.babu.optionalclass;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * public Optional<T> filter(     @NotNull  java.util.function.Predicate<? super T> predicate )
 *
 * If a value is present, and the value matches the given predicate, returns an Optional describing the value, otherwise returns an empty Optional.
 * Params:
 * predicate – the predicate to apply to a value, if present
 * Returns:
 * an Optional describing the value of this Optional, if a value is present and the value matches the given predicate, otherwise an empty Optional
 * Throws:
 * NullPointerException – if the predicate is null
 */
public class UseOfFilter {
    public static void main(String[] args) {
        //Option: 1
        //Optional<String> empty = Optional.empty();// gives Optional.empty
        Optional<Employee> empty = Optional.empty();
        System.out.println(empty.filter(emp -> emp.isManager()));

        //Option: 2
        Employee employee = Employee.getEmployee();

        Optional<Employee> emp = Optional.of(employee);//gives Optional[Employee]
        //Optional<Employee> emp = Optional.of(null);//gives NullPointerException
        System.out.println(emp.filter(emp2 -> emp2.getNumberOfProjectsAllocated() > 2));// //gives Optional[Employee]

        //Option: 3
        Optional<Employee> e = Optional.ofNullable(employee); //gives Optional[Employee]
        //Optional<Employee> e = Optional.ofNullable(null); //gives Optional.empty
        System.out.println(e.filter(Employee::isManager));

        Predicate<Employee> rolePredicate = employee1 -> employee1.isManager();
        Predicate<Employee> reportiesPredicate = employee2 -> employee2.getNumberOfReporties() > 5;
        Predicate<Employee> projectAllocationPredicate = employee3 -> employee3.getNumberOfProjectsAllocated() > 1;

        Optional<Employee> testEmp = Optional.ofNullable(employee);
            List<Employee> filteredEmp =
                    testEmp.filter(emp4 -> rolePredicate.and(reportiesPredicate).and(projectAllocationPredicate).test(emp4))
                            .stream().toList();

            filteredEmp.forEach(System.out::println);
    }
}
