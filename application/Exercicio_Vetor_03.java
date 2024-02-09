package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Vetor_03
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroInteiro03, contador03, numeroMenorIdade = 0;
        double soma03=0.0, media03;

        System.out.print("Quantas pessoas serao digitadas? ");
        numeroInteiro03 = sc.nextInt();

        String [] vetorNome = new String[numeroInteiro03];
        int [] vetorIdade = new int[numeroInteiro03];
        double [] vetorAltura = new double[numeroInteiro03];

        System.out.println();

        for (contador03=0; contador03<numeroInteiro03; contador03++)
        {
            System.out.printf("Digite os dados da %da pessoa%n", contador03+1);
            System.out.print("NOME : ");
            vetorNome[contador03] = sc.next();
            System.out.print("IDADE : ");
            vetorIdade[contador03] = sc.nextInt();
            System.out.print("ALTURA : ");
            vetorAltura[contador03] = sc.nextDouble();
            System.out.println();
        }

        for (contador03=0; contador03<numeroInteiro03; contador03++)
        {
            soma03 = soma03 + vetorAltura[contador03];
        }

        media03 = soma03 / numeroInteiro03;

        System.out.println();
        System.out.printf("Altura média: %.2f%n", media03);

        for (contador03=0; contador03<numeroInteiro03; contador03++)
        {
            if (vetorIdade[contador03] < 16)
            {
                numeroMenorIdade = numeroMenorIdade +1;
            }
        }

        double porcentagem = numeroMenorIdade * 100.0 / numeroInteiro03;

        System.out.printf("%n%d", numeroMenorIdade);
        System.out.printf(" Pessoas com menos de 16 anos : %.1f%%%n", porcentagem);

        for (contador03=0; contador03<numeroInteiro03; contador03++)
        {
            if (vetorIdade[contador03] < 16)
            {
                System.out.println(vetorNome[contador03]);
            }
        }

        sc.close();
    }
}
