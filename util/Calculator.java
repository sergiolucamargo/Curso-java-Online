package util;

public class Calculator
{
    public final double PI = 3.1416;
    public double circumference(double raio)
    {
        return 2.0 * PI * raio;
    }
    public double volume(double raio)
    {
        return (4.0 * PI * Math.pow(raio, 3)) / 3.0;
    }
}
