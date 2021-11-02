package chapter17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    private String department;

    public Employee(String firstName, String lastName, double salary, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

class EmployeeStreamOperations{
    public static void main(String[] args) {
        Employee[] employees =
                {new Employee("Nosa", "Edemakhiota", 50000, "Science"),
                new Employee("Eghosa", "Edemakhiota", 70000, "IT"),
                new Employee("Eseosa", "Edemakhiota", 90000, "Science"),
                new Employee("Ehimwenman", "Edemakhiota", 500000, "Science"),
                new Employee("Sunday", "Edemakhiota", 130000, "IT")};

        Predicate<Employee> employeePredicate =
                employee -> employee.getSalary() > 40000 && employee.getSalary() < 60000;
        Object[] sortedAndReversedArray = Arrays.stream(employees).filter(employeePredicate).
                sorted(Comparator.comparing(Employee::getSalary).reversed()).toArray();
//        System.out.println(Arrays.toString(sortedAndReversedArray));

        Function<Employee, String> byFirstName = Employee::getFirstName;
        Function<Employee, String> byLastName = Employee::getLastName;

        Comparator<Employee> comparingByFirstNameThenByLastName =
                Comparator.comparing(byFirstName).thenComparing(byLastName);

        Arrays.stream(employees).sorted(comparingByFirstNameThenByLastName.reversed()).
                forEach(System.out::println);

        Map<String, List<Employee>> listMap =
                Arrays.stream(employees).collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(listMap);

        listMap.forEach((department, employeeList) -> {
            System.out.println(department);
            employeeList.forEach(System.out::println
            );
        });
        Map<String, Long> employeeDepartmentCount =
                Arrays.stream(employees).collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting() ));
        employeeDepartmentCount.forEach((department, count) -> {
            System.out.println(department);
            System.out.println(count);
        });

        Double sumOfSalaries = Arrays.stream(employees)
                .mapToDouble(Employee::getSalary)
                .sum();
        System.out.printf("Total sum of employees salary is %.2f", sumOfSalaries);

        Double averageSalary = Arrays.stream(employees)
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);

        System.out.printf("Employees average Salary is %.2f%n", averageSalary);

    }
}