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
	//	multiplosDeSieteOnce();
	//	divisiblesEntreTresYNoDos();
	//	horaDelDia();
	//	numerosRomanos();
		sumaRestaMultiplicacion();
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
	//problema 7
	public static void divisiblesEntreTresYNoDos() {
		System.out.println("Números divisibles entre 3 pero NO 2");
		System.out.print("Ingresa el Número a evaluar: ");
		
		int numero = sc.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			if (i % 3 == 0 && i %2 != 0) {
				System.out.println(i);
			}
		}
	}
	//problema 8
	public static void horaDelDia() {
		System.out.println("Ingrese la hora del día en formato 24h:");
		int hora = sc.nextInt();
		
		if(hora < 0 || hora > 23 ){
			System.out.println("Número Invalido");
		}else if (hora >= 0 && hora < 12) {
			System.out.println("Mañana");
		}else if(hora >= 12 && hora < 18) {
			System.out.println("Tarde");
		}else if (hora >= 18 && hora <= 23) {
			System.out.println("Noche");
		}
	}
	//problema 9
	public static void numerosRomanos() {
		System.out.println("Conversión de números romanos");
		System.out.println("Ingresa un número del 1 al 5");
		int numero = sc.nextInt();
		String numeroRomano = "Sin numero";
		
		switch(numero) {
		case 1:
			numeroRomano = "I";
			break;
		case 2:
			numeroRomano = "II";
			break;
		case 3:
			numeroRomano = "III";
			break;
		case 4:
			numeroRomano = "IV";
			break;
		case 5:
			numeroRomano = "V";
			break;
			
			default :
				System.out.println("Número invalido");
				return;
		}
		System.out.println("La conversion a Número Romano es: " + numeroRomano);
	} 
	//Problema 10
	public static void sumaRestaMultiplicacion() {
		
		System.out.println("Bienvenido! Elige una opción (1-3)");
		System.out.println("1.Sumar");
		System.out.println("2.Restar");
		System.out.println("3.Multiplicar");
		int opcion = sc.nextInt();
		if (opcion > 3 || opcion < 1) {
			System.out.println("Opción invalida");
			return;
		}
		
		System.out.println("\nIngresa dos números.");
		System.out.print("Primer Número: ");
		double numero1 = sc.nextDouble();
		System.out.print("Segúndo Número: ");
		double numero2 = sc.nextDouble();
		double resultado;
		
		switch (opcion) {
		case 1: 
			resultado = numero1+(numero2);
			System.out.println("El resultado de: " + numero1 + " + " + numero2 +" es: " + resultado);
			break;
		case 2: 
			resultado = numero1-numero2;
			System.out.println("El resultado de: " + numero1 + " - " + numero2 + " es: " + resultado);
			break;
		case 3: 
			resultado = numero1*(numero2);
			System.out.println("El resultado de: " + numero1 + " * " + numero2 + " es: " + resultado);
			break;
			
			default:
			System.out.println("Número invalido");
			return;
		}
	}
}
	
