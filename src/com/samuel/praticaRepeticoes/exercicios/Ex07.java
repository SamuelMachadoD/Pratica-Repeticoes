package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int entrada = 0;
		int num = 0;
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite um numero: ");
			entrada = scan.nextInt();
			if(entrada >= num) {
				num = entrada;
			}
		}
		
		System.out.println("O maior numero digitado foi : " + num);
	}

}
