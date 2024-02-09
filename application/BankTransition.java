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
        sc.nextLine();
        String nameHolder = sc.nextLine();

        System.out.println("Is there na initial deposit (y/n)? ");
        char yesOrNo = sc.next().charAt(0);

        if (yesOrNo == 'y')
        {
            System.out.print("Enter initial deposit value: ");
            double firstDeposit = sc.nextDouble();
            account = new BankAccount(number, nameHolder, firstDeposit);
        }
        else
        {
            account = new BankAccount(number, nameHolder);
        }
        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double newDepositAmount = sc.nextDouble();
        account.deposit(newDepositAmount);
        System.out.println("Update Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double newWithdrawalAmount = sc.nextDouble();
        account.withdraw(newWithdrawalAmount);
        System.out.println("Update Account data: ");
        System.out.println(account);

        sc.close();
    }
}
