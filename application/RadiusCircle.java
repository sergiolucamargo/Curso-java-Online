package application;

import util.Calculator;

import java.util.Locale;
import java.util.Scanner;
public class RadiusCircle
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Calculator calc = new Calculator();
        double radius, circle, vol;

        System.out.println("Enter radius: ");
        radius = sc.nextDouble();

        circle = Calculator.circumference(radius);
        vol = Calculator.volume(radius);

        System.out.printf("Circumference: %.3f%n", circle);
        System.out.printf("Volume: %.3f%n", vol);
        System.out.printf("PI value: %.5f%n", Calculator.PI);

        sc.close();
    }

}
