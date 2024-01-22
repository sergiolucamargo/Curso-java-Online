package application;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class TotalGrade
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.print("DIGITE O NOME DO ALUNO: ");
        student.name = sc.nextLine();
        System.out.print("DIGITE NOTA 1º TRIMESTRE: ");
        student.grades01 = sc.nextDouble();
        System.out.print("DIGITE NOTA 2º TRIMESTRE: ");
        student.grades02 = sc.nextDouble();
        System.out.print("DIGITE NOTA 3º TRIMESTRE: ");
        student.grades03 = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.resultGrade());

        if (student.resultGrade() < student.AVERAGEGRADE)
        {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.differencePoints());
        }
        else
        {
            System.out.println("PASS ");
        }
        sc.close();
    }
}
