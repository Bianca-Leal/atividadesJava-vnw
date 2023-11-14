package br.com.vainaweb.backendt3.introducaot3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MegaSena {

    public static void main(String[] args) {
        // Configuração do scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Inicialização do vetor para armazenar os números escolhidos pelo usuário
        int[] numerosEscolhidos = new int[7];

        // Preenchimento do vetor com os números escolhidos pelo usuário
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o " + (i + 1) + "º número (entre 0 e 100): ");
            // Verifica se o próximo token é um número inteiro
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                // Verifica se o número está no intervalo correto
                if (numero >= 0 && numero <= 100) {
                    numerosEscolhidos[i] = numero;
                } else {
                    System.out.println("Número fora do intervalo. Tente novamente.");
                    i--; // Para repetir a leitura do mesmo índice
                }
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next(); // Descarta a entrada inválida
                i--; // Para repetir a leitura do mesmo índice
            }
        }

        // Sorteio dos números vencedores
        int[] numerosSorteados = sortearNumeros();

        // Exibição dos números sorteados
        System.out.println("Números sorteados: " + Arrays.toString(numerosSorteados));

        // Verificação dos acertos e exibição do prêmio
        int acertos = verificarAcertos(numerosEscolhidos, numerosSorteados);
        exibirPremio(acertos);

        // Fechamento do scanner
        scanner.close();
    }

    // Método para sortear os números vencedores
    private static int[] sortearNumeros() {
        Random random = new Random();
        int[] numerosSorteados = new int[7];
        for (int i = 0; i < 7; i++) {
            numerosSorteados[i] = random.nextInt(101); // Números de 0 a 100
        }
        return numerosSorteados;
    }

    // Método para verificar a quantidade de acertos
    private static int verificarAcertos(int[] escolhidos, int[] sorteados) {
        int acertos = 0;
        for (int numeroEscolhido : escolhidos) {
            for (int numeroSorteado : sorteados) {
                if (numeroEscolhido == numeroSorteado) {
                    acertos++;
                }
            }
        }
        return acertos;
    }

    // Método para exibir o prêmio de acordo com a quantidade de acertos
    private static void exibirPremio(int acertos) {
        System.out.print("Você acertou " + acertos + " número(s). ");

        switch (acertos) {
            case 5:
                System.out.println("Parabéns! Você ganhou 10 mil reais.");
                break;
            case 6:
                System.out.println("Parabéns! Você ganhou 50 mil reais.");
                break;
            case 7:
                System.out.println("Parabéns! Você ganhou 200 mil reais.");
                break;
            default:
                System.out.println("Infelizmente, você não ganhou nenhum prêmio.");
        }
    }
}
