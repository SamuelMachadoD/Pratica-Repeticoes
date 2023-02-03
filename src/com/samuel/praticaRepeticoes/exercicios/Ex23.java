package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int divisoes = 0;
		System.out.println("Digite um numero maximo: ");
		int valor = scan.nextInt();
		System.out.println("Primos entre 1 e " + valor +": ");
		
		for(int i = 2; i <= valor; i++) {
			boolean primo = true;
			for(int j = 2; j<i; j++) {
				divisoes++;
				if(i % j == 0) {
					primo = false;
				}
			}
			if(primo) {
				System.out.print(i + " - N. de divisões: ");
				System.out.println(divisoes);
			}
		}
	}
}