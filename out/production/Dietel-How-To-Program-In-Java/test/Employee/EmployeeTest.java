package Employee;

import ChapterThreeFiles.Employee.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {

    @Test
    void testThat1ConstructorInitializesEmployeeClassFields(){
        Employee newEmployee = new Employee("Kelvin", "Okoro", 50000.00);
        assertAll(
                () -> assertEquals("Kelvin", newEmployee.getFirstName()),
                () -> assertEquals("Okoro", newEmployee.getLastName()),
                () -> assertEquals(50000.00, newEmployee.getMonthlySalary())
        );
    }

    @Test
    void testThatFirstNameCanBeUpdated() {
        Employee newEmployee = new Employee("Kelvin", "Okoro", 50000.00);
        newEmployee.setFirstName("Micheal");
        assertEquals("Micheal", newEmployee.getFirstName());
    }

    @Test
    void testThatLastNameCanBeUpdated(){
        Employee newEmployee = new Employee("Kelvin", "Okoro", 50000.00);
        newEmployee.setLastName("Obi");
        assertEquals("Obi", newEmployee.getLastName());
    }

    @Test
    void testThatMonthlySalaryCannotBeSetToANegativeValue(){
        Employee newEmployee = new Employee("Kelvin", "Okoro", 50000.00);
        newEmployee.setMonthlySalary(-45000.00);
        assertEquals(0, newEmployee.getMonthlySalary());
    }

    @Test
    void testThatEmployeeSalaryCanBeRaisedBy10Percent(){
        Employee firstEmployee = new Employee("Kelvin", "Okoro", 50000.00);
        assertEquals(55000, firstEmployee.increaseEmployeeSalaryBy10Percent());
        Employee secondEmployee = new Employee("Micheal", "John", 45000.00);
        assertEquals(49500, secondEmployee.increaseEmployeeSalaryBy10Percent());
    }

    @Test
    void testThatEmployeeYearlySalaryCanBeDisplayed(){
        Employee firstEmployee = new Employee("Kelvin", "Okoro", 50000.00);
        assertEquals("Yearly Salary: $600000.0", firstEmployee.displayYearlySalary());
        Employee secondEmployee = new Employee("Micheal", "John", 45000.00);
        assertEquals("Yearly Salary: $540000.0", secondEmployee.displayYearlySalary());
    }

    @Test
    void testThatEmployeeYearlySalaryCanBeDisplayedAfter10PercentRaise(){
        Employee firstEmployee = new Employee("Kelvin", "Okoro", 50000.00);
        firstEmployee.increaseEmployeeSalaryBy10Percent();
        assertEquals("Yearly Salary: $660000.0", firstEmployee.displayYearlySalary());
        Employee secondEmployee = new Employee("Micheal", "John", 45000.00);
        secondEmployee.increaseEmployeeSalaryBy10Percent();
        assertEquals("Yearly Salary: $594000.0", secondEmployee.displayYearlySalary());
    }
}