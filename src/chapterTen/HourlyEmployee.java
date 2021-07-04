package chapterTen;

public class HourlyEmployee extends Employee{

    private double wages;
    private int numberOfHoursWorked;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, int numberOfHoursWorked,
                          double wages) {
        super(firstName, lastName, socialSecurityNumber);
        this.wages = validateWages(wages);
        this.numberOfHoursWorked = validateNumberOfHoursWorked(numberOfHoursWorked);
    }

    private int validateNumberOfHoursWorked(int numberOfHoursWorked) {
        if (numberOfHoursWorked < 0 || numberOfHoursWorked > 168){
            throw  new IllegalArgumentException("Invalid number of hours worked per week");
        }
        return numberOfHoursWorked;
    }

    private double validateWages(double wages) {
        if (wages < 0.0){
            throw new IllegalArgumentException("Wages must be greater than 0.0");
        }
        return wages;
    }

    public double getWages() {
        return wages;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public int getNumberOfHoursWorked() {
        return numberOfHoursWorked;
    }

    public void setNumberOfHoursWorked(int numberOfHoursWorked) {
        this.numberOfHoursWorked = numberOfHoursWorked;
    }

    @Override
    public double earnings() {
        if (getNumberOfHoursWorked() > 40){
            return (getWages() * 40 ) + (getWages() * (getNumberOfHoursWorked() - 40) * 1.5);
        }
        return getWages() * getNumberOfHoursWorked();
    }

    @Override
    public String toString() {
        return String.format("""
                Hourly Employee:
                    %s
                    Number of hours worked : %02d hours
                    Hourly wages : $%,.2f""",super.toString(), getNumberOfHoursWorked(), getWages());
    }
}
