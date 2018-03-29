package Lista;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual atemperatura em Farenheit?");
		float tempF = scanner.nextFloat();
		float tempC;
		
		//C = (5 * (F-32) / 9)
		
		tempC= 5*(tempF - 32)/9;	
		
		System.out.println("A temperatura em Celcius é:  "+tempC+" C°");
	}
}