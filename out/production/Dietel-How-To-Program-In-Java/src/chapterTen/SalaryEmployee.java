package chapterTen;

public class SalaryEmployee extends Employee {

    private double weeklySalary;

    public SalaryEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = validation(weeklySalary);
    }

    private double validation(double weeklySalary) {
        if (weeklySalary < 0.0){
             throw new IllegalArgumentException("Weekly salary must be greater than or equals to 0.0");
        }
        return weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("""
                Salaried employee:
                    %s
                    weekly salary : $%,.2f""", super.toString(), getWeeklySalary());
    }
}
