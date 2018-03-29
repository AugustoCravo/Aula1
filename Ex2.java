package Lista;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Qual a altura?");
		// (72.7*altura) - 58
		double altura;
		altura = scanner.nextDouble();
		double peso = 72.7d*altura - 58;
		System.out.println("O peso ideal é "+peso+" Kg");
	}
	
}
