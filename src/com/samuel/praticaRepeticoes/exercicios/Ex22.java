package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean primo = true;
		
		System.out.println("Digite um numero: ");
		int valor = scan.nextInt();
		System.out.println("Divisores:");
		for(int i = 2; i < valor; i++) {
			if(valor % i == 0) {
				primo = false;
				System.out.println(i);
			}
		}
		if(primo) {
			System.out.println("Não possui divisores, é um numero primo");
		}else {
			System.out.println("Não é primo");
		}
	}
}