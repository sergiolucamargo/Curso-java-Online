package entities;

public class Employee
{
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary()
    {
        double resultSalary;
        resultSalary = grossSalary - tax;
        return resultSalary;
    }
    public void increaseSalary(double percentage)
    {
        grossSalary += grossSalary * (percentage/100);
    }
    public String toString()
    {
        return name + ", $ " + netSalary();
    }
}
