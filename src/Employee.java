

public class Employee {
    public static final int taxAllowance = 100;
    public static final int lowerTaxLimit = 500;
    public static final int upperTaxLimit = 4000;
    public static final double factorDecrementStep = 0.01;

    private String firstName;
    private String lastName;
    private int salary;
    private int bonus;



    public Employee(String firstName, String lastName, int salary, int bonus) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.bonus = bonus;

    }

    public int getTaxeableSalary() {
        return salary + bonus - taxAllowance;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public int getSalary() {
        return salary;
    }


    public double getTax() {
        int taxeableSalary =getTaxeableSalary();
        double tax;

        if (taxeableSalary < lowerTaxLimit) tax = taxeableSalary * 0.1;
        else if (taxeableSalary > upperTaxLimit)
            tax = (upperTaxLimit * 0.22) + (0.4 * (taxeableSalary - upperTaxLimit));
        else tax = taxeableSalary * 0.22;

        return tax;
    }

    public void increaseSalary(double factor) {

        double i;
        double oldTax = getTax();
        int oldSalary = getSalary();

        for (i = factor; i >= 1 && (oldSalary * (i - 1)) >= oldTax; i = i - factorDecrementStep) ;

        System.out.println("Salary increase factor is " + i);
        System.out.println("Salary increase: " + (int) (oldSalary * (i - 1)) + " old taxes: " + oldTax);
        setSalary((int) (oldSalary * i));
    }


    @Override
    public String toString() {
        return "\nFirst Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Salary: " + salary + "\n" +
                "Bonus: " + bonus + "\n"+
                "Taxes: " + getTax() + "\n\n";
    }


}