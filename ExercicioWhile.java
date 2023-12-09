package Javinha;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

        int back = 0, front = 0, mobile = 0, fullstack = 0, cont = 0, soma = 0;
        String continua = "S";

        while (continua.equalsIgnoreCase("S")) {
            System.out.println("Digite a idade: ");
            int idade = leia.nextInt();

            int genero = obterGenero(leia);

            System.out.println("Digite a categoria..");
            System.out.println("(1-Back/2-Front/3-Mobile/4-Full): ");
            int categoria = obterCategoria(leia);

            if (categoria == 1) {
                back++;
            }

            if (categoria == 2 && genero == 2) {
                front++;
            }

            if (categoria == 3 && genero == 1 && idade > 40) {
                mobile++;
            }

            if (categoria == 4 && genero == 2 && idade < 30) {
                fullstack++;
            }

            cont++;
            soma += idade;

            System.out.println("Deseja Continuar (S/N)?");
            leia.nextLine();
            continua = leia.nextLine().toUpperCase();
        }

        int media = (cont > 0) ? soma / cont : 0;

        exibirResultados(back, front, mobile, fullstack, cont, media);
    }

    private static int obterGenero(Scanner leia) {
        int genero;
        do {
            System.out.println("Digite o sexo (1-M/2-F/3-Outros): ");
            genero = leia.nextInt();
        } while (genero < 1 || genero > 3);
        return genero;
    }

    private static int obterCategoria(Scanner leia) {
        int categoria;
        do {
            System.out.println("Digite a categoria..");
            System.out.println("(1-Back/2-Front/3-Mobile/4-Full): ");
            categoria = leia.nextInt();
        } while (categoria < 1 || categoria > 4);
        return categoria;
    }

    private static void exibirResultados(int back, int front, int mobile, int fullstack, int cont, int media) {
        System.out.println("\nTotal de pessoas desenvolvedoras Backend: " + back);
        System.out.println("Total de mulheres desenvolvedoras Frontend: " + front);
        System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + mobile);
        System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + fullstack);
        System.out.println("O número total de pessoas que responderam à pesquisa: " + cont);
        System.out.println("A média de idade das pessoas que responderam à pesquisa: " + media);
		

		
		
	}

}
