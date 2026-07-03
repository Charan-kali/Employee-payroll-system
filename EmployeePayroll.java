
import java.util.Scanner;

public class EmployeePayroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();

        System.out.print("Enter Employee ID: ");
        String empId = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();
        double hra = basicSalary * 0.40; // 40% HRA
        double da = basicSalary * 0.15;  // 15% DA
        double pf = basicSalary * 0.12;  // 12% PF deduction

        double grossSalary = basicSalary + hra + da - pf;

    
        System.out.println("\n=============================================");
        System.out.println("              EMPLOYEE PAYSLIP               ");
        System.out.println("=============================================");
        System.out.printf("%-20s : %s\n", "Employee ID", empId);
        System.out.printf("%-20s : %s\n", "Employee Name", empName);
        System.out.println("---------------------------------------------");
        System.out.printf("%-20s : %.2f\n", "Basic Salary", basicSalary);
        System.out.printf("%-20s : + %.2f\n", "HRA (40%)", hra);
        System.out.printf("%-20s : + %.2f\n", "DA (15%)", da);
        System.out.printf("%-20s : - %.2f\n", "PF (12%)", pf);
        System.out.println("---------------------------------------------");
        System.out.printf("%-20s : %.2f\n", "GROSS SALARY", grossSalary);
        System.out.println("=============================================");

        scanner.close();
    }
}
