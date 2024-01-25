package entities;

public class BankAccount
{
    private int accountNumber;
    private String holder;
    private double accountBalance;
    public BankAccount()
    {

    }
    public BankAccount(int accountNumber, String holder, double accountBalance)
    {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.accountBalance = accountBalance;
    }
    public BankAccount(int accountNumber, String holder)
    {
        this.accountNumber = accountNumber;
        this.holder = holder;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public String getHolder()
    {
        return holder;
    }
    public void setHolder(String holder)
    {
        this.holder = holder;
    }
    public double getAccountBalance()
    {
        return accountBalance;
    }
    public void deposit (double amount)
    {
    }
    public void withdraw (double amount)
    {
    }
}