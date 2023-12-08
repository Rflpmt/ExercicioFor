package Javinha;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	int quantNumeros = 10;
	int NumerosPares = 0;
	int NumerosImpares = 0;
	
	System.out.println("\nDigite 10 numeros inteiros: ");
	
	for (int i=0; i < quantNumeros; i++) {
	System.out.println("\nNumero " + (i + 1) + ": ");
	int numero = leia.nextInt();
	
	if (numero % 2 == 0) {
	NumerosPares++;
	} else { 
	NumerosImpares++;
	 }
	}
	System.out.println("\nResultados: ");
	System.out.println("\nNumeros Pares: " + NumerosPares);
	System.out.println("\nNumeros Impares: " + NumerosImpares);
	
	leia.close();
	
	}
		

	}
