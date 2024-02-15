package application;

import java.util.Scanner;

public class AulaMatriz01
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER THE DIMENSION OF THE MATRIX (the number entered will be the same for rows and columns): ");
        int n = sc.nextInt();
        System.out.println();

        int [][] matriz  = new int[n][n];

        for(int contador01=0; contador01<matriz.length; contador01++)
        {
            for(int cont01=0; cont01<matriz[contador01].length; cont01++)
            {
                matriz[contador01][cont01] = sc.nextInt();
            }
        }

        System.out.println("Main Diagonal: ");
        for(int contador02=0; contador02<matriz.length; contador02++)
        {
            System.out.print(matriz[contador02][contador02] + " ");

        }
        System.out.println();

        int count = 0;

        for(int contador03=0; contador03<matriz.length; contador03++)
        {
            for (int cont03=0; cont03<matriz[contador03].length; cont03++)
            {
                if (matriz[contador03][cont03] < 0)
                {
                    count++;
                }
            }
        }
        System.out.println("Quantity negative numbers : " + count);

        sc.close();
    }
}