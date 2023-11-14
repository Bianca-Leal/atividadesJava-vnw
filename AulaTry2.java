package br.com.vainaweb.backendt3.introducaot3;


import java.util.Scanner;

/**
* Classe utilizada para demonstrar o uso da palavra chave throw,
* utilizada quando queremos lançar uma exceção.
*/
	public class AulaTry2 {
		 public static final String SENHASECRETA = "123456";

		  public static void main(String[] args) {
		    Scanner s = new Scanner(System.in);
		    
		    try {
		      System.out.print("Digite a senha: ");
		      String senha = s.nextLine();
		      if (!senha.equals(SENHASECRETA)) {
		        throw new Exception("Senha inválida!!!");
		      }
		      System.out.println("Senha correta!!!\nBem-vindo(a)!!!");
		    } catch (Exception ex) {
		      System.out.println(ex.getMessage());
		    } finally {
		      s.close();
		      System.out.println("Programa encerrado.");
		    }
	}
}


