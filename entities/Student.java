package entities;

public class Student
{
    public static final int AVERAGE_GRADE = 60;
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
        if (resultGrade() < AVERAGE_GRADE)
        {
            return AVERAGE_GRADE - resultGrade();
        }
        else
        {
            return 0.0;
        }
    }

}