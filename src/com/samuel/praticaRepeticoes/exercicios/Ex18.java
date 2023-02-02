package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double maior = 0;
		double menor = 0;
		double soma = 0;
		
		for(boolean flag = true;flag;) {
			System.out.println("Digite um numero: ( Digite 0 para encerrar )");
			double valor = scan.nextDouble();
			
			if(valor != 0) {
				if(valor > maior) {
					maior = valor;
				}else if(valor < menor) {
					menor = valor;
				}
				soma += valor;
			}else {
				flag = false;
			}
		}
		
		System.out.println("O maior valor digitado foi: " + maior);
		System.out.println("O menor valor digitado foi: " + menor);
		System.out.println("A soma dos valores digitado é: " + soma);

	}

}
