package aula1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantos anos você tem?");
		int numero = scanner.nextInt();
		if (numero >= 30){
			System.out.println("Você é velho!");
		}
		if (numero <= 15){
			System.out.println("Você é muito novo!");
		}
		if (numero > 15 && numero < 30)
		{
			System.out.println("Você é novo!");
		}
		//verifica a idade, se for maior que 30 imprime "Você é velho"
		System.out.println();
	}
}
