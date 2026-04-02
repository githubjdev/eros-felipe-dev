package eros.felipe.whiledowhile;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         int opcao = -1;
         
         do {
        	 
        	    System.out.println("=====MENU====");
        	    System.out.println("1 - Cadastrar");
        	    System.out.println("2 - Listar");
        	    System.out.println("0 - Sair");
        	    System.out.print("Escolha: ");
             opcao = scanner.nextInt(); 
        	 
         }while(opcao != 0); // quando for zero ele para de rodar do while e sai fora
         
         
         System.out.println("Sistema encerrado.");
         
         scanner.close();
         
	}

}
