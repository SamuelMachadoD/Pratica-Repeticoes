package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double soma = 0;
		double media = 0;

		for(boolean flag = true; flag;) {
			System.out.println("Digite uma nota: ");
			soma += scan.nextDouble();
			media++;
			
		}

	}

}
