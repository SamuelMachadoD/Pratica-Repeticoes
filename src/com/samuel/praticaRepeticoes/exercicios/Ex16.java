package com.samuel.praticaRepeticoes.exercicios;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int pre = 0, pos = 1, res = 0;
		boolean flag = true;
		for(;flag;) {
			if(res <= 500) {
				res = pre + pos;
				pre = pos;
				pos = res;
				System.out.println(res);
			}else {
				flag = false;
			}
			
		}

	}

}
