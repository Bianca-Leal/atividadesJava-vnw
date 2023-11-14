package br.com.vainaweb.backendt3.introducaot3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MegaSena {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int[] numerosEscolhidos = new int[7];

        
        for (int i = 0; i < 7; i++) {
            System.out.print("Digite o " + (i + 1) + "º número (entre 0 e 100): ");
            if (scanner.hasNextInt()) {
                int numero = scanner.nextInt();
                if (numero >= 0 && numero <= 100) {
                    numerosEscolhidos[i] = numero;
                } else {
                    System.out.println("Número fora do intervalo. Tente novamente.");
                    i--; 
                }
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                scanner.next(); 
                i--;
            }
        }

       
        int[] numerosSorteados = sortearNumeros();

        
        System.out.println("Números sorteados: " + Arrays.toString(numerosSorteados));

        
        int acertos = verificarAcertos(numerosEscolhidos, numerosSorteados);
        exibirPremio(acertos);

        
        scanner.close();
    }

    private static int[] sortearNumeros() {
        Random random = new Random();
        int[] numerosSorteados = new int[7];
        for (int i = 0; i < 7; i++) {
            numerosSorteados[i] = random.nextInt(101);
        }
        return numerosSorteados;
    }

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
