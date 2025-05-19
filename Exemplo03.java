/******************************************************************************
Exemplo 03 - Matriz 3 X 3
*******************************************************************************/
import java.util.Scanner;
public class Exemplo03
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	// Criando a matriz 3x3 vazia 
	int [][] matriz = new int [3][3];
	
	// Entrada de dados 
	System.out.println ("Digite os elementos da matriz 3 X 3:");
	for (int i=0; i<3; i++) {
	    for (int j=0; j<3; j++){
	        System.out.println ("Elemento [" +i+ "] [" +j+ "]:");
	        matriz [i][j]= ler.nextInt();
	    }
	}
	// Imprimindo a matriz 
	System.out.println("Matriz 3x3 inserida:");
        for (int i =0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        System.out.print(matriz[i][j] + " ");
	    }
	    System.out.println ();
	}
	}
}
