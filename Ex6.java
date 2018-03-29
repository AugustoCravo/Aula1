package Lista;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite 5 numeros");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int n4 = scanner.nextInt();
		int n5 = scanner.nextInt();
	
	int soma, media;
	
	soma = n1 + n2 + n3 + n4 + n5;
	media = soma/5;
	
	System.out.println("A soma é "+soma);
	System.out.println("A media é "+media);
	}
}