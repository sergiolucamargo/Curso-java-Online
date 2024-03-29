package application;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entities.WorkerLevel;

import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class ProgramEnum
{
    public static void main(String[] args) throws ParseException
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String nameDepartament = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String nameWorker = sc.nextLine();
        System.out.print("Level: ");
        String nameLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double  baseSalaryValue= sc.nextDouble();
        System.out.println();

        Worker worker = new Worker(nameWorker, WorkerLevel.valueOf(nameLevel), baseSalaryValue, new Departament(nameDepartament));

        System.out.print("How many contracts to this worker? ");
        int quantContract = sc.nextInt();

        for(int cont01=1; cont01<=quantContract; cont01++)
        {
            System.out.println("Enter contract #" + cont01 + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
