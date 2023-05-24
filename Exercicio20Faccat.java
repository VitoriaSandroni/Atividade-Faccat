package exemplos;

import java.util.Scanner;

public class Exercicio20Faccat {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor: ");
		int valor=sc.nextInt();
		System.out.println("Digite um valor: ");
		int valor1=sc.nextInt();
		
		if(valor==valor1) {
			System.out.println("digite valores distintos");
	} else {
		System.out.println("")
	}
		if(valor>valor1) {
			System.out.println("O maior valor digitado foi: "+valor+" e o menor numero digitado foi: "+valor1);
		} else {
			System.out.println("O maior valor digitado foi: "+valor1+" e menor valor digitado foi: "+valor);
		}
		sc.close();
		

	}

}
