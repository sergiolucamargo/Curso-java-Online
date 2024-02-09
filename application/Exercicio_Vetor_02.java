package application;

import java.util.Locale;
import java.util.Scanner;
public class Exercicio_Vetor_02
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroInteiro02, contador02;
        double soma02=0.0, media02;

        System.out.print("Quantos numeros voce vai digitar? ");
        numeroInteiro02 = sc.nextInt();
        double [] vetorParaNumeros02 = new double[numeroInteiro02];

        for (contador02=0; contador02<numeroInteiro02; contador02++)
        {
            System.out.printf("Digite um numero: ");
            vetorParaNumeros02[contador02] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for (contador02=0; contador02<numeroInteiro02; contador02++)
        {
            System.out.printf("%.2f  ", vetorParaNumeros02[contador02]);
        }

        for (contador02=0; contador02<numeroInteiro02; contador02++)
        {
            soma02 += vetorParaNumeros02[contador02];
        }

        System.out.println();
        System.out.println("SOMA = " + soma02);
        System.out.printf("MEDIA = %.2f", media02 = soma02/numeroInteiro02);

        sc.close();
    }
}
