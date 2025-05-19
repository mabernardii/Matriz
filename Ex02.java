/******************************************************************************
Exercício 02 - Faça um programa que leia uma matriz 3x4 de inteiros, substitua
seus elementos negativos por 0 e imprima a matriz original e a modificada.
*******************************************************************************/
import java.util.Scanner;
public class Ex02
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	// Criando a matriz 4x4 vazia 
    int [] []  matriz = new int [3][4];
   
    matriz [0][0] = 10;
    matriz [0][1] = 20;
    matriz [0][2] = 30;
    matriz [0][3] = 40;
   
    matriz [1][0] = 50;
    matriz [1][1] = 60;
    matriz [1][2] = 70;
    matriz [1][3] = 80;
   
    matriz [2][0] = 90;
    matriz [2][1] = -10;
    matriz [2][2] = -20;
    matriz [2][3] = -30;
   
    System.out.println ("Matriz original: ");
   
    for (int i = 0; i < matriz.length; i++){
       for (int j = 0; j < matriz[i].length; j++){
       System.out.print(matriz[i][j] + " ");
      }
      System.out.println ();
   }
   
    System.out.println ("Matriz modificada: ");
    for (int i = 0; i < matriz.length; i++){
       for (int j = 0; j < matriz[i].length; j++){
           if (matriz[i][j] < 0){
               matriz[i][j] = 0;
           }
           System.out.print(matriz[i][j] + " ");
       }  System.out.println ();
    }
     
}
}