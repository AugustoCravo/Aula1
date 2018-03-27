package aula1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {//main, control + space (primeira opção)
		Scanner scanner = new Scanner(System.in);
		int[] numeros = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int i;
		
		
		System.out.println("Números pares:");
		for (i=0;i<numeros.length;i++){
			if (numeros[i]%2==0){
				System.out.println(numeros[i]);
			}
			
		}
		
		System.out.println("Números impares:");
		for (i=0;i<numeros.length;i++){
			if (numeros[i]%2!=0){
				System.out.println(numeros[i]);
			}
			
		}
		// usar o for para imprimir todos os numeros pares. 
	}
}
