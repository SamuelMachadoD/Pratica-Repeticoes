package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor1 = scan.nextInt();
		int valor2 = scan.nextInt();
		int soma = 0;
		
		for(valor1++;valor1 < valor2;valor1++) {
			System.out.println(valor1);
			soma += valor1;
		}
		
		System.out.println("A soma desses valores : " + soma);
	}

}
