package com.hiagodonha.mc.model;

import java.util.Scanner;

public class Teste {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite algo fi: ");
		int x = in.nextInt();
		
		
		for(int i=0; i<x; i++) {
			System.out.println(i);
		}
	
		in.close();
	}
}
