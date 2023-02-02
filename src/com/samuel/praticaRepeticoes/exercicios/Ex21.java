package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean primo = true;
		
		System.out.println("Digite um numero: ");
		int valor = scan.nextInt();
		
		for(int i = 2; i < valor; i++) {
			if(valor % i == 0) {
				primo = false;;
			}
		}
		
		if(primo) {
			System.out.println("é um numero primo");
		}else {
			System.out.println("Não é primo");}
		}

}
