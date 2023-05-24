/*5)Escreva um algoritimo para ler um valor (do teclado) e (na tela) o seu antecessor*/

package exemplos;

import java.util.Scanner;
public class Exercicio5Faccat {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite um valor: ");
			int valor = sc.nextInt();
			int resultado = valor-1;
			System.out.println("O numero antecessor do digitado é: "+resultado);
			sc.close();
			
		} catch (Exception e) {
			System.out.println("Informe um NUMERO " +e);
		}
	
		

	
	}

}
