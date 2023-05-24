package qa;

import java.util.Scanner;

public class Exercicio7Faccat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade apenas em anos: ");
		int ano = sc.nextInt();
		System.out.println("Digite a quantidade de meses que passou do seu ultimo aniversaio: ");
		int mes = sc.nextInt();
		System.out.println("Digite a quantidade de dias que passou do seu ultimo mesversario: ");
		int dia = sc.nextInt();
		int diasVividos = ano*365+mes*30+dia;
		System.out.println("A quantidade de dias vividos corresponde a: "+diasVividos);
				
	}

}
