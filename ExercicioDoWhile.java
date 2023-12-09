package Javinha;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
		
		
		 Scanner leia = new Scanner(System.in);

	        int numero, soma = 0, cont = 0;

	        do {
	            System.out.print("Digite um número (ou 0 para encerrar): ");
	            numero = leia.nextInt();

	            if (numero % 3 == 0 && numero != 0) {
	                soma += numero;
	                cont++;
	            }

	        } while (numero != 0);

	        if (cont > 0) {
	            double media = (double) soma / cont;
	            System.out.println("A média dos números múltiplos de 3 é: " + media);
	        } else {
	            System.out.println("Nenhum número múltiplo de 3 foi digitado.");
	        }
	    }
			
	}


