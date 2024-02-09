package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;
import entities.ProductVector;

public class Program_Vector
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /* Primeira Aula

        int n = sc.nextInt();
        double[] vect = new double[n];
        for (int i = 0; i < n; i++)
        {
            vect[i] = sc.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++)
        {
            sum += vect[i];
        }
        double avg = sum / n;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);

        //**************************************************/

        /* Segunda Aula */

        int n = sc.nextInt();
        ProductVector[] vet = new ProductVector[n];

        for (int i=0; i<vet.length; i++) {
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vet[i] = new ProductVector(name, price);
        }
        double sum = 0.0;
        for (int i=0; i<vet.length; i++) {
            sum += vet[i].getPrice();
        }
        double avg = sum / vet.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        //**************************************************/

        sc.close();
    }
}
