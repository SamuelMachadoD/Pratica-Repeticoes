package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int anos = 0;
		
		double paisA = 0;
		double paisB = 0;
		
		double taxaA = 0;
		double taxaB = 0;
		
		for(String flag = "1"; !flag.equals("0");) {
			
			do{
				System.out.println("Digite a população do menor Pais: ");
				paisA = scan.nextDouble();
			}while(paisA <= 0);
			
			do{
				System.out.println("Digite sua taxa de crescimento: ");
				taxaA = scan.nextDouble();
			}while(taxaA <= 0);
			
			do{
				System.out.println("Digite a população do maior Pais: ");
				paisB = scan.nextDouble();
			}while(paisB <= 0);
			
			do{
				System.out.println("Digite sua taxa de crescimento: ");
				taxaB = scan.nextDouble();
			}while(taxaB <= 0);
			
			for(;paisA <= paisB;) {
				paisA += paisA * taxaA ;
				paisB += paisB * taxaB ;
				anos++;
			}
			
			System.out.println(anos + " Anos");
			System.out.println("Deseja repetir?");
			System.out.println("0 - parar o programa");
			System.out.println("Qualquer outra tecla, continuar!");
			flag = scan.next();
		}	
		


	}

}
