package br.com.vainaweb.backendt3.introducaot3;

import java.util.Scanner;

		public class Retangulo { 
			public static void main(String[] args) {
		        // Declara as variáveis
		        float base, altura;

		        // Lê a base e a altura do retângulo
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Digite a base do retângulo: ");
		        base = scanner.nextFloat();
		        System.out.print("Digite a altura do retângulo: ");
		        altura = scanner.nextFloat();

		        // Calcula a área e o perímetro do retângulo
		        float area = base * altura;
		        float perimetro = 2 * (base + altura);

		        // Exibe a área e o perímetro do retângulo
		        System.out.println("A área do retângulo é: " + area);
		        System.out.println("O perímetro do retângulo é: " + perimetro);
		        
     }
}
