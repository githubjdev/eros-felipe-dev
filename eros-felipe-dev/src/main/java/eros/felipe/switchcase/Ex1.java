package eros.felipe.switchcase;

public class Ex1 {

	public static void main(String[] args) {

		int dia = 2;
		String nomeDia = "";

		switch (dia) {
		case 1:
			nomeDia = "Domingo";
			break;
		case 2:
			nomeDia = "Segunda";
			break;
		case 3:
			nomeDia = "Terça";
			break;
		default:
			nomeDia = "Desconhecido";
		}

		System.out.println(nomeDia);
		
		
		
		
		//-------------------------Simplificado----------------------
		
		String nomeDoDia = switch (dia) {
		  case 1 -> "Domingo";
		  case 2 -> "Segunda";
		  case 3 -> "Terça";
		  default -> "Desconhecido";
		};
		
		System.out.println("Forma mais simples: " + nomeDoDia);

	}

}
