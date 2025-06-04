/******************************************************************************
3. Crie um algoritmo informe qual o maior e qual o menor elemento existente em uma matriz
6x3.
*******************************************************************************/
import java.util.Scanner;

public class Matriz03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[6][3];
        int maior, menor;

        // Comentado pois está sobrescrevendo a matriz acima:
        /*
        int[][] matriz = {
            {10, 5, 2},
            {7, 1, 9},
            {3, 8, 4},
            {12, 6, 11},
            {15, 20, 14},
            {18, 13, 16}
        };
        */

        System.out.println("Digite os elementos da matriz 6x3:");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
            }
        }

        maior = matriz[0][0];
        menor = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("O maior elemento presente dentro da matriz é :" + maior);
        System.out.println("O menor elemento presente dentro da matriz é :" + menor);

        System.out.println();
    }
}