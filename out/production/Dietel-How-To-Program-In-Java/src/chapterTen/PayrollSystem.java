package chapterTen;

public class PayrollSystem {
    private static HourlyEmployee hourlyEmployee;
    private static SalaryEmployee salaryEmployee;
    private static CommissionEmployee commissionEmployee;
    private static BaseSalaryPlusCommissionEmployee baseSalaryPlusCommissionEmployee;
    private Employee[] employees = new Employee[4];

    public static void main(String[] args) {
        hourlyEmployee = new HourlyEmployee("Janet", "Ishola", "7467-47884-4884", 69, 6500);
        salaryEmployee = new SalaryEmployee("Iseoluwa", "Fasoyin", "56738-38893-387", 4700);
        commissionEmployee = new CommissionEmployee("Kelvin", "Okoro", "5784-89494-4848",560800, 0.25);
        baseSalaryPlusCommissionEmployee = new BaseSalaryPlusCommissionEmployee(
                "Kola", "Badmus", "4848-48848-48884", 580000.00, 0.10, 10000);

        Employee[] employees = new Employee[4];
        employees[0] = salaryEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = baseSalaryPlusCommissionEmployee;

        for (Employee employee: employees) {
            System.out.println(employee);
            System.out.printf("\tEarned : $%,.2f", employee.earnings());
            System.out.println();
            System.out.println();
        }
        int count = 0;
        for (Employee employee: employees) {
            System.out.printf("Employee[%d]: %s%n",count,employee.getClass().getName());
            count++;
        }
    }

}
