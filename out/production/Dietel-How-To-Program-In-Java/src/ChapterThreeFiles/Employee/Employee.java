package ChapterThreeFiles.Employee;

public class Employee {
    String firstName;
    String lastName;
    double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0){
            this.monthlySalary = 0.0;
        }
        else {
            this.monthlySalary = monthlySalary;
        }
    }

    public String displayYearlySalary() {
        double yearlySalary = 12 * getMonthlySalary();
        return ("Yearly Salary: $" + yearlySalary);
    }

    public double increaseEmployeeSalaryBy10Percent() {
        double percentageRaise = 0.1;
        this.monthlySalary = (getMonthlySalary() * percentageRaise) + getMonthlySalary();
        return (monthlySalary);
    }
}
