package br.com.vainaweb.backendt3.introducaot3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AulaTry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Digite o valor do dividendo: ");
            int dividendo = sc.nextInt();
            System.out.println("Digite o valor do divisor: ");
            int divisor = sc.nextInt();

            if (divisor == 0) {
                throw new ArithmeticException("Não é permitido dividir por zero.");
            }

            int resultado = dividendo / divisor;
            System.out.println("Resultado é: " + resultado);
        } catch (InputMismatchException e) {
            System.err.println("Entrada inválida. O valor deve ser um inteiro.");
        } catch (ArithmeticException e) {
            System.err.println("Erro aritmético: " + e.getMessage());
        } finally {
            // É uma boa prática fechar o Scanner no bloco finally
            sc.close();
        }
    }
}
