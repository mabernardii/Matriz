/******************************************************************************
Exercício 03 - Faça um programa que leia uma matriz [5,5]de inteiros e
verifique se existem elementos repetidos.Mostrar a matriz e os números repetidos.
*******************************************************************************/
import java.util.Scanner;
public class Ex03
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	// Criando a matriz 4x4 vazia 
    int[][] matriz = new int[5][5];
        int[] numeros = new int[25];
        int indice = 0;

       
        System.out.println("Digite os elementos da matriz 5x5:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = ler.nextInt();
                numeros[indice] = matriz[i][j];
                indice++;
            }
        }

       
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

       
        System.out.println("\nNúmeros repetidos:");
        boolean temRepetido = false;
        for (int i = 0; i < 25; i++) {
            int atual = numeros[i];
            boolean jaVerificado = false;

           
            for (int k = 0; k < i; k++) {
                if (numeros[k] == atual) {
                    jaVerificado = true;
                    break;
                }
            }

            if (jaVerificado) continue;

           
            int contador = 0;
            for (int j = 0; j < 25; j++) {
                if (numeros[j] == atual) {
                    contador++;
                }
            }

            if (contador > 1) {
                System.out.println(atual + " (ocorreu " + contador + " vezes)");
                temRepetido = true;
            }
        }

        if (!temRepetido) {
            System.out.println("Nenhum número repetido encontrado.");
        }

       
    }
} 