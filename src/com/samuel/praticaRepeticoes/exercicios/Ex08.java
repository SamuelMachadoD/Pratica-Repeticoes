package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int soma = 0;
		int media = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite um numero: ");
			soma += scan.nextInt();
		}
		media = soma / 5;
		
		System.out.println("A soma final dos numero é: " + soma);
		System.out.println("E a média final: " + media);

	}

}
