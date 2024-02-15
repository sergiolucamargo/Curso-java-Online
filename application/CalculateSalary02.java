package application;

import entities.Employee02;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CalculateSalary02
{
    public static void main (String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee02> lista02 = new ArrayList<>();

        int contador, numberEmployees, searchEmployeeNumber;
        Integer id;
        String name;
        double salary;

        System.out.print("How many employees will be registered? : ");
        numberEmployees = sc.nextInt();

        for (contador=0; contador<numberEmployees; contador++)
        {
            System.out.println();
            System.out.println("Emplyoee #" + (contador+1) + ":");
            System.out.print("Id: ");
            id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Salary: ");
            salary = sc.nextDouble();

            Employee02 emp = new Employee02(id, name, salary);
            lista02.add(emp);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        searchEmployeeNumber = sc.nextInt();
        Integer pos = position(lista02, searchEmployeeNumber);
        if (pos == null)
        {
            System.out.println("This id does not exist!");
        }
        else
        {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            lista02.get(pos).increaseSalary(percent);
        }
        System.out.println();
        System.out.println("List of employees: ");
        for (Employee02 objeto : lista02)
        {
            System.out.println(objeto);
        }

        sc.close();
    }

    public static Integer position(List<Employee02> list, int idRead)
    {
        for (int i=0; i<list.size(); i++)
        {
            if(list.get(i).getId() == idRead)
            {
                return i;
            }
        }
        return null;
    }

}
