package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor = 0;
		int par = 0;
		int impar = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite um numero: ");
			valor = scan.nextInt();
			if(valor % 2 == 0) {
				par++;
			}else {
				impar++;
			}
		}
		
		System.out.println("Dos 10 numeros digitados----");
		System.out.println(par + " são par");
		System.out.println(impar + " são impar");

	}

}
