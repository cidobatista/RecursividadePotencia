package view;

import controller.PotenciaController;

public class Principal {

	public static void main(String[] args) {
		
		PotenciaController pc = new PotenciaController();
		
		int base = 2;
		int expoente = 5;
		int pot = pc.pot(base, expoente);
		System.out.println("O resultado da potencia � " +pot+  " com la�o.");
		
		int potencia = pc.potencia(base, expoente);
		System.out.println("O resultado da potencia � " +pot+  " com recursividade.");
	}

}
