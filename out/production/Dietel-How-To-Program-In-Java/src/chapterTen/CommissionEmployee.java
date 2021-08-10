package chapterTen;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales,
                              double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);
        this.grossSales = validation(grossSales);
        this.commissionRate = validation(commissionRate);
    }

    double validation(double criteria) {
        if (criteria < 0.0){
            throw new IllegalArgumentException("Invalid parameter");
        }
        return criteria;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSales();
    }

    @Override
    public String toString() {
        return String.format("""
                Commission Employee:
                    %s
                    Gross Sales: %.2f
                    Commission Rate : %.2f""", super.toString(), getGrossSales(), getCommissionRate());
    }
}
