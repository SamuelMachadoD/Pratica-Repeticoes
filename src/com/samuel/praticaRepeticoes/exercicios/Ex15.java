package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int pre = 0, pos = 1, res = 0;
		System.out.println("Digite o limite ( n-ésimo termo ) : ");
		int limite = scan.nextInt();
		System.out.println(pre);
		for(int i = 0; i < limite; i++) {
			res = pre + pos;
			pre = pos;
			pos = res;
			System.out.println(res);
		}

	}

}
