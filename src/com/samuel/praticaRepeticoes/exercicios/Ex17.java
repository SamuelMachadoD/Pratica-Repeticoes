package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o numero a ter sua fatorial calculada: ");
		int valor = scan.nextInt();
		
		for(int i = valor; i > 1; i--) {
			valor *= (i-1);
		}
		
		System.out.println("Fatorial Resultado " + valor);

	}

}
