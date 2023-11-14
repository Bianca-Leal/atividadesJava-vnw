package br.com.vainaweb.backendt3.introducaot3;

	import java.util.Scanner;

	public class Exercicio2 {

		public static void main(String[] args) {
		    Scanner scanner = new Scanner(System.in);

		    // Declara a variável
		     int numero;

		    // Recebe o número do usuário
		     System.out.print("Digite um número: ");
		     numero = scanner.nextInt();

		    // Verifica se o número é par
		    String resultado = numero % 2 == 0 ? "par" : "ímpar";

		    // Imprime o resultado
		    System.out.println("O número é " + resultado);
		    }
		}
