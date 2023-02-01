package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ver tabuada do numero: ");
		int numero = scan.nextInt();
		
		int resultado = 0;
		
		System.out.println("o Tabuada de " + numero);
		for(int i = 1; i <= 10; i++) {
			resultado = numero * i;
			System.out.println("   " + numero + " X " + i + " = " + resultado );
		}
	}

}
