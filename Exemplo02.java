/******************************************************************************
Exemplo 02 - Matriz 3 X 3
*******************************************************************************/
import java.util.Scanner;
public class Exemplo02
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	// Criando a matriz 3x3 vazia 
	int [][] matriz = {
	    {5,3,6},
	    {6,7,9},
	    {4,6,10}
	};
	
	// Imprimindo a matriz 
	System.out.println("Matriz 3x3:");
        for (int i =0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j] + " ");
	    }
	    System.out.println ();
	}
	}
}
