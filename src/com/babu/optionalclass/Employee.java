package com.babu.optionalclass;

import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;

public class Employee {
    private int empId;

    private BigDecimal salary;
    private String name;
    private boolean isManager;
    private int numberOfReporties;
    private int numberOfProjectsAllocated;

    private Optional<String> address;

    public Employee() {
    }

   /* public Employee(String name, boolean isManager, int numberOfReporties, int numberOfProjectsAllocated) {
        this.name = name;
        this.isManager = isManager;
        this.numberOfReporties = numberOfReporties;
        this.numberOfProjectsAllocated = numberOfProjectsAllocated;
    }*/

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isManager() {
        return isManager;
    }

    public void setManager(boolean manager) {
        isManager = manager;
    }

    public int getNumberOfReporties() {
        return numberOfReporties;
    }

    public void setNumberOfReporties(int numberOfReporties) {
        this.numberOfReporties = numberOfReporties;
    }

    public int getNumberOfProjectsAllocated() {
        return numberOfProjectsAllocated;
    }

    public void setNumberOfProjectsAllocated(int numberOfProjectsAllocated) {
        this.numberOfProjectsAllocated = numberOfProjectsAllocated;
    }

    public Optional<String> getAddress() {
        return address;
    }

    public void setAddress(Optional<String> address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId && isManager == employee.isManager && numberOfReporties == employee.numberOfReporties && numberOfProjectsAllocated == employee.numberOfProjectsAllocated && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId, name);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", isManager=" + isManager +
                ", numberOfReporties=" + numberOfReporties +
                ", numberOfProjectsAllocated=" + numberOfProjectsAllocated +
                ", address=" + address +
                '}';
    }

    public static Employee getEmployee(){
        Employee employee = new Employee();
            employee.setSalary(BigDecimal.valueOf(100000.00));
            employee.setManager(true);
            employee.setName("Hemanth");
            employee.setNumberOfReporties(6);
            employee.setNumberOfProjectsAllocated(2);
            employee.setAddress(Optional.of("5th Avenue, New York"));

        return employee;
    }
}
