package eros.felipe.conversaotipo;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex1 {
	
	
	 public static void main(String[] args) {
		
		 String qtdEstoue = "10,50860"; /*Da tela, de um aplicativo, de uma integração, etc (JSON ou XML)*/
		 qtdEstoue = qtdEstoue.replaceAll(",", ".");
		 
		 /*Poderia atualizar para 10 se o estoque fosse zero no banco de dados.*/
		 
		 /*No banco de dados normalmente o tipo vai ser Inteiro ou Double*/
		 

		 
		 Double qtdDouble = Double.valueOf(qtdEstoue);
		 System.out.println("Valor em double: " + qtdDouble);
		 
		 Integer qtdInteiro = Integer.valueOf(qtdDouble.intValue());
		 System.out.println("Valor em inteiro: " + qtdInteiro);
		 
		 
		 BigDecimal valorMonetario = BigDecimal.valueOf(qtdDouble).setScale(5, RoundingMode.FLOOR);
		 
		 System.out.println("Valor em BigDecimal: " + valorMonetario);
		 
		 
		 String valorString = String.valueOf(qtdInteiro);
		 System.out.println("Valor em String: "+ valorString);
		 
		 
	}

}
