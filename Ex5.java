package Lista;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o número para tabuada");
		int numero = scanner.nextInt();
		if (numero >=1 && numero <10){
			System.out.println(numero);
		}else System.out.println("Numero inválido.");
		
	System.out.println("Tabuada do numero "+numero);	
	for(int i=1; i<11; i++){
		System.out.println(i+" X " +numero+" = "+i*numero);
		}
	}
}