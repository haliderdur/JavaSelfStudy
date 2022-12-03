package SelfStudy.ConstructorsPractise.SalaryTask;

public class SalaryObjects {
    public static void main(String[] args) {

        SalaryCalculator salary1 = new SalaryCalculator(25.5, 10, 27.3, 40);
        System.out.println(salary1);
        salary1.stateTaxRate = 12;

        System.out.println("Salary1 after tax: " + salary1.salaryAfterTax());

        SalaryCalculator salary2 = new SalaryCalculator(30, 16, 24, 40);
        System.out.println(salary2);

        System.out.println("Salary2 after tax: " + salary2.salaryAfterTax());
    }
}
