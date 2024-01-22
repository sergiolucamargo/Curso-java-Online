package application;

import entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class CalculateSalary
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee activeEmployee = new Employee();

        System.out.print("Name: ");
        activeEmployee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        activeEmployee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        activeEmployee.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Employee: " + activeEmployee.name + ", $ " + activeEmployee.netSalary());

        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double percentageValue = sc.nextDouble();
        activeEmployee.increaseSalary(percentageValue);

        System.out.println();
        System.out.println("Update data: " + activeEmployee);

        sc.close();
    }
}