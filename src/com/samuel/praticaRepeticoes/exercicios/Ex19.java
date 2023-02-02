package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double maior = 0;
		double menor = 999999;
		double soma = 0;
		
		for(boolean flag = true;flag;) {
			System.out.println("Digite um numero: ( Digite 0 para encerrar )");
			double valor = scan.nextDouble();
			
			if(valor > 0 && valor < 1000) {
				if(valor > maior) {
					maior = valor;
				}
				if(valor < menor) {
					menor = valor;
				}
				soma += valor;
			}else if (valor == 0){
				System.out.println("Encerrando!");
				flag = false;
			}else {
				System.out.println("Numero invalido - Digite apenas validos ( 1 - 999 )");
			}
		}
		
		System.out.println("O maior valor digitado foi: " + maior);
		System.out.println("O menor valor digitado foi: " + menor);
		System.out.println("A soma dos valores digitado é: " + soma);

	}

}
