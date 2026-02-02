package eros.felipe.tipodados;

public class Ex1 {
	
	public static void main(String[] args) {
		
		int quantidade = 10; /*valor inteiro e sem casa decimal*/
		double quantidade2 = 10.2; /*casas decimais*/
		double preco = 19.90; /*casas decimais*/
		boolean ativo = true; /*true ou false*/

		char categoria = 'A'; /*categoria de energia de uma geladeira*/
		
		String categoria2 = "Ação";
		
		
		
		/*====================Classes Wrappers==========================*/
		/*São obejtos dos tipos primitivos*/
		
		Integer quantidadeW = 10; /*seria o int primitivo*/
		
		Double precow = 19.99;
		
		Boolean ativow = false;
		
		Character caCharacterw = 'A';
		
		ativow = null; /*true, false e null*/
		
	    int qtd = quantidadeW.intValue();
	    
	    
	    Integer valNull = 10;
	    
	    System.out.println("Valor : " + valNull.doubleValue());
	    
	    /*============================String============================*/
	    
	    String nome = "Alex Fernando Egido";
	    
	    System.out.println("Classe String: "+ nome.substring(5, 13));
	    
	    
	    StringBuilder juntarTexto = new StringBuilder();
	    juntarTexto.append(" Java é \n");
	    juntarTexto.append(" uma linguagem \n");
	    juntarTexto.append(" ótima");
	    
	    String resultado = juntarTexto.toString();
	    
	    System.out.println("String Builder: " + resultado);
	    
	    
	    Integer valora = 1;
	    Integer valorb = 1;
	    
	    System.out.println("Saida de Integer: " + valora.equals(valorb));
	    
	    int x = 0;
	    
	    System.out.println(x);
		
	}

}
