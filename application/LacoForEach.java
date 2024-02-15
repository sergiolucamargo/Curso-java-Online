package application;

import java.util.Locale;
import java.util.Scanner;

public class LacoForEach
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int contator04;

        String[] vetorString01 = new String[] {"Sergio", "Luiz", "de", "Camargo"};

        for (contator04=0; contator04 < vetorString01.length; contator04++ )
        {
            System.out.printf("Posição %d do Vetor  = %s%n", contator04, vetorString01[contator04]);
        }

        System.out.println();
        System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.println();

        for (String objeto : vetorString01)
        {
            System.out.println(objeto);
        }

        sc.close();
    }

}
