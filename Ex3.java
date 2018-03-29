package Lista;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite os 3 numeros:");
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int maior = C;
		int menor = C;
		
		if(A>B){
			if(A>=C){
				maior = A;
			}
		}
		
		if(B>=A){
			if(B>=C){
				maior = B;
			}
		}
		
		if(C>=A){
			if(C>=B){
				maior = C;
			}
		}
		
		if(A<=B){
			if(A<=C){
				menor = A;
			}
		}
		
		if(B<=A){
			if(B<=C){
				menor = B;
			}
		}
		
		if(C<=A){
			if(C<=B){
				menor = C;
			}
		}
			
		
		System.out.println("O maior é  "+maior);
		System.out.println("O menor é  "+menor);
	}
}