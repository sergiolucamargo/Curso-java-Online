package entities;

public class BankAccount
{
    private int accountNumber;
    private String holder;
    private double accountBalance;

    public BankAccount(int accountNumber, String holder, double firstDeposit)
    {
        this.accountNumber = accountNumber;
        this.holder = holder;
        deposit(firstDeposit);
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
        accountBalance += amount;
    }
    public void withdraw (double amount)
    {
        accountBalance -= amount + 5.0;
    }
    public String toString ()
    {
        return "Account "
                + accountNumber
                + ", "
                + "Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", accountBalance);
    }
}