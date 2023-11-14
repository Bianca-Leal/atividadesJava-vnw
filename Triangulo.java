package br.com.vainaweb.backendt3.introducaot3;

import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        // Lê as medidas dos lados do triângulo
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do lado 1: ");
        float l1 = scanner.nextFloat();
        System.out.print("Digite o valor do lado 2: ");
        float l2 = scanner.nextFloat();
        System.out.print("Digite o valor do lado 3: ");
        float l3 = scanner.nextFloat();

        // Verifica se os lados formam um triângulo
        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            // Verifica o tipo de triângulo
            if (l1 == l2 && l2 == l3) {
                System.out.println("Triângulo equilátero");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("Triângulo isósceles");
            } else {
                System.out.println("Triângulo escaleno");
            }
        } else {
            System.out.println("Os valores informados não formam um triângulo");
        }
    }
}
