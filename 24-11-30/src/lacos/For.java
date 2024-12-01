package lacos;

public class For {
public static void main(String[] args) {
	
	//imprima os valores pares de 1 a 20
	
	//pares -> x % 2 == 0
	
	for(int i = 2; i <= 20; i+=2) {
		System.out.print(i + " ");
		
	}
	System.out.println("\nCom if");
	for(int i = 1; i <= 20; i++) {
		if(i % 2 == 0) {
			System.out.print(i + " ");
		}
	}
	
	System.out.println();
	System.out.println();
	System.out.println();
	System.out.println();
	
	int soma = 0;
	for(int i = 1; i <= 20; i++) {
		System.out.print(i + " ");
		soma += i; 
	}

	
	System.out.println("\nSoma: " + soma);
	
	System.out.println();
	for(int i = 20; i >= 1; i--) {
		System.out.print(i + " "); 
	}
	
	
}
}
