package chapterTen;

public class BaseSalaryPlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BaseSalaryPlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber,
                                            double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        this.baseSalary = validation(baseSalary);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return String.format("""
                Base Salary Plus %s
                    Base Salary : $%,.2f""",super.toString(), getBaseSalary());
    }
}
