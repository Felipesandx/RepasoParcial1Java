package com.repaso;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
	//	sumatoriaNumeroDivisible ();
	//	numeroFactorial();
	//	leerCantidadNum();
		promedioNumerosPares();
	}
	//problema 1
	public static void sumatoriaNumeroDivisible () {
	
		int n = 0;
		int numero = 0;
		int suma = 0;
		final int DIVISOR = 4;
		
		System.out.println("Ingrese un número");
		n = sc.nextInt();
		
		while (n >= numero) {
			if(numero % DIVISOR == 0) {
				suma = suma + numero;
			}
			numero += 4;
		}
		System.out.println("Respuesta: " + suma);
	}
	//problema 2
	public static void numeroFactorial() {
		System.out.println("Calcular el factorial de un número");
		System.out.println("Introduce un número:");
		
		int numero = sc.nextInt();
		if (numero < 0) {
			System.out.println("Número invalido");
			return;
			}
			long factorial = 1;
			for (int i = 1; i <= numero; i++) {
				factorial *= i;
			}
			System.out.println("\nEl factorial de " + numero + " es " + factorial );
		
	}
	//problema 3
	public static void leerCantidadNum() {
		System.out.println("Ingresa la cantidad de números deseados:");
		int cantidad = sc.nextInt();
		
		int positivos = 0;
		int negativos = 0; 
		int ceros = 0;
		
		if (cantidad < 0) {
			System.out.println("Cantidad de números invalida");
			return;
		}
		System.out.println("Ingresa " + cantidad + " números:");
			for (int i = 0; i < cantidad; i++) {
				int n = sc.nextInt();
				if (n > 0) {
					positivos++;
					
				}else if (n == 0) {
					ceros++;
				}else {
					negativos++;
				}
			}
		System.out.println("Se registraron " + positivos + " positivos");
		System.out.println("Se registraron " + ceros + " ceros");
		System.out.println("Se registraron " + negativos + " negativos");
	}
	//problema 4
	public static void promedioNumerosPares() {
		System.out.println("Ingresa un número:");
		
		double numero = sc.nextInt();
		double contador = 0;
		double suma = 0;
		final int DIVISOR = 2;
		
		if (numero < 0) {
			System.out.println("Ingresa un número valido:");
			return;
		}else {
			while (numero  < contador) {
				for(int i = 0; i < numero; i++ ) {
					if (numero % DIVISOR == 0) {
						suma = suma + contador;
					}
					 contador++; 
				}
				System.out.println("Respuesta: " + suma/contador );
			}
		}
		
	}
}
