package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int anos = 0;
		
		for(int paisA = 80000, paisB = 200000; paisA <= paisB;) {
			
			paisA += paisA * 0.03 ;
			paisB += paisB * 0.015 ;
			anos++;
		}
		
		System.out.println(anos + " Anos");

	}

}
