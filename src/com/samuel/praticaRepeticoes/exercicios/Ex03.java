package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome, sexo, estadoCivil = null;
		int idade = 0;
		double salario = 0;
		
		//validação do nome (mais de 3 caracter)
		do {
			System.out.println("Nome: ");
			nome = scan.next();
			if(nome.length() <= 3) {
				System.out.println("Nome invalido!");
			}
		}while(nome.length() <= 3);
		
		//validação idade (entre 0 e 150)
		while(idade < 0 || idade > 150) {
			System.out.println("Idade: ");
			idade = scan.nextInt();
			if(idade < 0 || idade > 150) {
				System.out.println("Idade invalida!");
			}
		}
		
		for(;salario < 0;) {
			System.out.println("Salario: ");
			salario = scan.nextDouble();
			if(salario < 0) {
				System.out.println("Salario invalido");
			}
		}
		
		System.out.println("Sexo (F ou M): ");
		sexo = scan.next();
		System.out.println("Estado civil (S, C, V, D): ");
		estadoCivil = scan.next();

	}

}
