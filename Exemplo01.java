/******************************************************************************
Exemplo 01 - Matriz 3 X 3
*******************************************************************************/
import java.util.Scanner;
public class Exemplo01
{
	public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	// Criando a matriz 3x3 vazia 
	int [][] matriz = new int [3][3];
	// Atribuindo os valores manualmente 
	matriz [0] [0] = 5;
	matriz [0] [1] = 3;
	matriz [0] [2] = 2;
	
	matriz [1] [0] = 4;
	matriz [1] [1] = 3;
	matriz [1] [2] = 6;
	
	matriz [2] [0] = 7;
	matriz [2] [1] = 8;
	matriz [2] [2] = 1;
	// Imprimindo a matriz 
	System.out.println ("Matrix 3 X 3:");
	for (int i = 0; i < matriz.length; i++) {
	    for (int j=0; j< matriz[i].length; j++) {
	        System.out.println (matriz [i][j] + " ");
	    }
	    System.out.println ();
	}
	}
}
