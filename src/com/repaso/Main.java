package com.repaso;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		SumatoriaNumeroDivisible ();
	}
	//problema 1
	public static void SumatoriaNumeroDivisible () {
	
		int n = 0;
		int numero = 0;
		int suma = 0;
		final int DIVISOR = 4;
		
		System.out.println("Ingrese un número");
		numero = sc.nextInt();
		
		while (n >= numero ) {
			if(numero % DIVISOR ==0) {
				suma = suma + numero;
			}
			numero++;
		}
		System.out.println("Respuesta: " + suma);
	}
}
