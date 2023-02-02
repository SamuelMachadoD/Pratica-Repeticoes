package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		for(boolean flag = true; flag;) {
			System.out.println("Digite o numero(Até 16) a ter sua fatorial calculada: "
					+ "\n(Digite 0 para encerrar)");
			int valor = scan.nextInt();
			
			if(valor == 0) {
				flag = false;
			}else if(valor <= 16 && valor > 0) {
				for(int i = valor; i > 1; i--) {
					valor *= (i-1);
				}
				System.out.println("Fatorial Resultado " + valor);
			}else {
				System.out.println("Valor invalido!");
			}
			
			
			
		}
	}

}
