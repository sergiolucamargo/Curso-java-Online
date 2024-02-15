package application;

import java.util.Scanner;

public class ExercicioSobreMatriz
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int linha, coluna;

        System.out.println("DEFININDO O FORMATO DA MATRIZ:");
        System.out.println();

        System.out.print("Digite o numero de linhas da matriz: ");
        linha = sc.nextInt();
        System.out.print("Digite o numero de colunas da matriz: ");
        coluna = sc.nextInt();
        int [][] matrizDinamica = new int[linha][coluna];

        for (int contador01=0; contador01<matrizDinamica.length; contador01++)
        {
            for (int cont01=0; cont01<matrizDinamica[contador01].length; cont01++)
            {
                matrizDinamica[contador01][cont01] = sc.nextInt();
            }
        }
        System.out.println();

        System.out.print("Digite um numero que pertence a matriz criada: ");
        int numeroMatriz = sc.nextInt();
        System.out.println();

        for (int contador02=0; contador02<matrizDinamica.length; contador02++)
        {
            for (int cont02=0; cont02<matrizDinamica[contador02].length; cont02++)
            {
                if (matrizDinamica[contador02][cont02] == numeroMatriz)
                {
                    System.out.printf("Posicao: %d , %d%n%n", contador02, cont02);
                    if (cont02 > 0) {
                        System.out.println("Left: " + matrizDinamica[contador02][cont02-1]);
                    }
                    if (contador02 > 0) {
                        System.out.println("Up: " + matrizDinamica[contador02-1][cont02]);
                    }
                    if (cont02 < matrizDinamica[contador02].length-1) {
                        System.out.println("Right: " + matrizDinamica[contador02][cont02+1]);
                    }
                    if (contador02 < matrizDinamica.length-1) {
                        System.out.println("Down: " + matrizDinamica[contador02+1][cont02]);
                    }
                }

            }
        }


        System.out.println();
        sc.close();
    }
}
