package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class BankTransition
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        BankAccount account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        String nameHolder = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)? ");
        char yesOrNo = sc.nextLine().charAt(0);

        if (yesOrNo == 'y');
        {
            System.out.println("Enter initial deposit value: ");
            double bankDeposit = sc.nextDouble();
        }
        else
        {
            System.out.println("Account data:");
            
        }
    }
}
