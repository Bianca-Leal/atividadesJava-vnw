package br.com.vainaweb.backendt3.introducaot3;

import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declara as variáveis
        int numero1, numero2, numero3;

        // Recebe os números do usuário
        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        numero3 = scanner.nextInt();

        // Verifica qual é o maior
        int maior = numero1;
        if (numero2 > maior) {
            maior = numero2;
        }
        if (numero3 > maior) {
            maior = numero3;
        }

        // Verifica qual é o menor
        int menor = numero1;
        if (numero2 < menor) {
            menor = numero2;
        }
        if (numero3 < menor) {
            menor = numero3;
        }

        // Imprime o resultado
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
    }
}

