package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean pass = true;
		
		while( pass == true ) {
			
			System.out.println("Digite o login: ");
			String login = scan.next();
			
			System.out.println("Digite a senha: ");
			String senha = scan.next();
			
			if(senha.equals(login)) {
				System.out.println("Erro! Senha e Login iguais!");
				pass = true;
			}else {
				pass = false;
			}
			
		}	
	}
		
}

