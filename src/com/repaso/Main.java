package com.repaso;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
	//	sumatoriaNumeroDivisible ();
	//	numeroFactorial();
	//	leerCantidadNum();
	//	promedioNumerosPares();
	//	sumaDigitos();
		multiplosDeSieteOnce();
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
		
		int numero = sc.nextInt();
		int contador = 0;
		int suma = 0;
		final int DIVISOR = 2;
		
		if (numero < 0) {
			System.out.println("Ingresa un número valido:");
			return;
		}
		for(int i = 1; i <= numero; i++ ) {
			if (i % DIVISOR == 0) {
				suma += i;
				contador++; 
				}
			}
		if (contador > 0) {
			System.out.println("Respuesta: " + (double)suma/contador );
			}
		}
	//problema 5
	public static void sumaDigitos() {
		System.out.println("Ingrese un número para conocer sus digitos sumados");
		
		int numero = sc.nextInt();
		int suma = 0;
		int digito;
		
		numero = Math.abs(numero);//valor absoluto
		
		while (numero != 0) {
			digito = numero % 10; //tomar el ultimo digito
			suma+= digito;
			numero = numero / 10; //
		}
		System.out.println("La suma de los digitos es: " + suma);
		}
	//problema 6
	public static void multiplosDeSieteOnce() {
		System.out.println("Introduce un número para conocer si es multiplo de 7 u 11");
		System.out.print("Número: ");
		
		int numero = sc.nextInt();
		
		if (numero % 7 == 0 && numero % 11 == 0) {
			System.out.println("El número es multiplo de 7 y de 11");
			return;
		}else if (numero % 11 == 0) {
			System.out.println("El número es multiplo de 11");
		}else if(numero % 7 == 0) {
			System.out.println("El número es multiplo de 7");
		}else {
			System.out.println("El número no es multiplo de ningúno");
		}
	}
}
	
