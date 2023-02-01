package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int valor1 = scan.nextInt();
		int valor2 = scan.nextInt();
		
		for(valor1++;valor1 < valor2;valor1++) {
			System.out.println(valor1);
		}
	}

}
