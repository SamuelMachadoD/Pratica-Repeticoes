package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome, sexo = null, estadoCivil = null;
		int idade = -1;
		double salario = -1;
		
		//validação do nome (mais de 3 caracter)
		do {
			System.out.println("Nome: ");
			nome = scan.next();
			if(nome.length() <= 3) {
				System.out.println("Nome ínvalido!");
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
		
		//validação salario ( maior que 0 )
		for(;salario < 0;) {
			System.out.println("Salario: ");
			salario = scan.nextDouble();
			if(salario < 0) {
				System.out.println("Salario invalido");
			}
		}
		
		//validação sexo ( apenas f e m )
		for( boolean flag = true; flag;) {
			System.out.println("Sexo (F ou M): ");
			sexo = scan.next();
			if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				flag = false;
			}else {
				System.out.println("Sexo invalido!");
			}
		}
		
		//validação estado civil ( apenas s, c, v ou d;
		for( boolean flag = true; flag;) {
			System.out.println("Estado civil (S, C, V, D): ");
			estadoCivil = scan.next();
			switch (estadoCivil) {
			case "s":
			case "c":
			case "v":
			case "d":
			case "S":
			case "C":
			case "V":
			case "D":
				flag = false;
				break;
			default:
				System.out.println("Estado Civil invalido!");
			}
		}
		
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salario: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado Civil: " + estadoCivil);

	}

}
