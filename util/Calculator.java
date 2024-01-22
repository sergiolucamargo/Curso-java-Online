package util;

public class Calculator
{
    public static final double PI = 3.1416;
    public static double circumference(double raio)
    {
        return 2.0 * PI * raio;
    }
    public static double volume(double raio)
    {
        return (4.0 * PI * Math.pow(raio, 3)) / 3.0;
    }
}
