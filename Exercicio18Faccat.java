package exemplos;

import java.util.Scanner;

public class Exercicio18Faccat {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o ano atual: ");
		int anoAtual=sc.nextInt();
		System.out.println("Digte o seu ano de nascimento: ");
		int anoNascimento=sc.nextInt();
		int idade=anoAtual-anoNascimento;
		if(idade>=16) {
			System.out.println("Você esta apto à votar");
		} else {
			System.out.println("Você não esta apto a votar");
		}
		sc.close();
		

	}

}
