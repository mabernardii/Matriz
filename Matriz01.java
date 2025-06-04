/******************************************************************************
1. Crie um programa que leia uma matriz 5x5. Em seguida, conte quantos números pares
existem na matriz.
*******************************************************************************/
import java.util.Scanner;

public class Matriz01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int contadorPares = 0;

       
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = ler.nextInt();
            }
        }

       
        System.out.println("Matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

     
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] % 2 == 0) {
                    contadorPares++;
                }
            }
        }

        System.out.println("A quantidade de números pares presentes na matriz é: " + contadorPares);
    }
}