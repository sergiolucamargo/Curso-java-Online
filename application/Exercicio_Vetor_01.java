package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Vetor_01
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*Exemplo primeira Aula
        int numberPositions, contator;
        double sum = 0.0, average;
        System.out.print("ENTER THE NUMBER OF VECTOR POSITIONS: ");
        numberPositions = sc.nextInt();
        double[] vetor = new double[numberPositions];
        for (contator=0; contator<numberPositions; contator++)
        {
            System.out.printf("Position value %d : ", contator+1);
            vetor[contator] = sc.nextDouble();
        }
        for(contator=0; contator<numberPositions; contator++)
        {
            sum += vetor[contator];
        }
        average = sum/numberPositions;
        System.out.printf("%n AVERAGE HEIGHT = %.2f %n", average);
        //**********************************************************************************/

        int numeroInteiro, contador;

        System.out.print("Quantos numeros voce vai digitar? ");
        numeroInteiro = sc.nextInt();
        double [] vetorParaNumeros = new double[numeroInteiro];

        for (contador=0; contador<numeroInteiro; contador++)
        {
            System.out.printf("Digite um numero: ");
            vetorParaNumeros[contador] = sc.nextDouble();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for (contador=0; contador<numeroInteiro; contador++)
        {
            if (vetorParaNumeros[contador]<0)
            {
                System.out.printf("%.0f%n", vetorParaNumeros[contador]);
            }
        }

        sc.close();

    }
}
