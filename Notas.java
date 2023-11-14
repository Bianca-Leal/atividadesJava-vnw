package br.com.vainaweb.backendt3.introducaot3;

import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declara as variáveis
        double nota;

        // Recebe a nota do usuário
        System.out.print("Digite a sua nota: ");
        nota = scanner.nextDouble();

        // Verifica a situação do aluno
        String situacao = "";
        if (nota >= 7) {
            situacao = "passou direto";
        } else if (nota >= 5) {
            situacao = "ficou de recuperação";
        } else {
            situacao = "foi reprovado";
        }

        // Exibe a situação do aluno
        System.out.println("Você está " + situacao);

        // Exibe a média, independentemente da situação
        System.out.println("A sua média foi de " + nota);
    }
}

