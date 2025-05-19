/******************************************************************************
Exercício 01 - Desenvolver um programa que leia uma matriz 4 X 4
   a) Verificar o número de linhas e colunas
   b) Mostrar a matriz  formatada
*******************************************************************************/
import java.util.Scanner;
public class Ex01
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	// Criando a matriz 4x4 vazia 
	int [][] matriz = new int [4][4];
	
	// Entrada de dados 
	System.out.println ("Digite os elementos da matriz 4 X 4:");
	for (int i=0; i<4; i++) {
	    for (int j=0; j<4; j++){
	        System.out.println ("Elemento [" +i+ "] [" +j+ "]:");
	        matriz [i][j]= ler.nextInt();
	    }
	}
	// Imprimindo a matriz 
	System.out.println("Matriz 4x4 inserida:");
        for (int i =0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
        System.out.print(matriz[i][j] + " ");
	    }
	    System.out.println ();
	}
	}
}
