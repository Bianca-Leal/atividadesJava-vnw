package br.com.vainaweb.backendt3.introducaot3;

import java.util.Scanner;

public class Cardapio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Restaurante Java Delícia!");
        System.out.println("Menu:");

        System.out.println("1. Hambúrguer - R$10.00");
        System.out.println("2. Pizza - R$12.00");
        System.out.println("3. Sushi - R$15.00");
        System.out.println("4. Salada - R$8.00");
        System.out.println("5. Sair");

        double totalPedido = 0.0;

        while (true) {
            System.out.print("Escolha um item (1-4) ou digite 5 para sair: ");
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Hambúrguer - R$10.00 adicionado ao pedido.");
                    totalPedido += 10.00;
                    break;
                case 2:
                    System.out.println("Pizza - R$12.00 adicionada ao pedido.");
                    totalPedido += 12.00;
                    break;
                case 3:
                    System.out.println("Sushi - R$15.00 adicionado ao pedido.");
                    totalPedido += 15.00;
                    break;
                case 4:
                    System.out.println("Salada - R$8.00 adicionada ao pedido.");
                    totalPedido += 8.00;
                    break;
                case 5:
                    System.out.println("Pedido finalizado. Total a pagar: R$" + totalPedido);
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, escolha um item válido.");
            }
        }
    }
}
