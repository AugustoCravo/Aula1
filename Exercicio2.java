package aula1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Quantos anos voc� tem?");
		int numero = scanner.nextInt();
		if (numero >= 30){
			System.out.println("Voc� � velho!");
		}
		if (numero <= 15){
			System.out.println("Voc� � muito novo!");
		}
		if (numero > 15 && numero < 30)
		{
			System.out.println("Voc� � novo!");
		}
		//verifica a idade, se for maior que 30 imprime "Voc� � velho"
		System.out.println();
	}
}
