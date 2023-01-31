package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int valor = 0;
		
		
		while(valor !=5 ){
			System.out.println("Digite um numero de 0 a 10: ");
			valor = scan.nextInt();
			if(valor != 5) {
				System.out.println("Errou!");
			}else {
				System.out.println("Acertou!!");
			}
			
		}
	}

}
