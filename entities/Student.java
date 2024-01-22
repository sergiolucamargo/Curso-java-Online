package entities;

public class Student
{
    public static final int AVERAGEGRADE = 60;
    public String name;
    public double grades01;
    public double grades02;
    public double grades03;
    public double resultGrade()
    {
        return grades01 + grades02 + grades03;
    }
    public double differencePoints()
    {
        if (resultGrade() < AVERAGEGRADE)
        {
            return AVERAGEGRADE - resultGrade();
        }
        else
        {
            return 0.0;
        }
    }

}