//8) Escreva  um  algoritmo  para  ler  o  número  total  de  eleitores  de um  município,  o  número  de  votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. 

package qa;

import java.util.Scanner;

public class Exercicio8Faccat {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Digite a quantidade total de eleitorares de um municipio");
		int eleitores = sc.nextInt();
		System.out.println("Digite a quantidade total de eleitorares que votaram em branco");
		int votosBrancos = sc.nextInt();
		System.out.println("Digite a quantidade total de eleitorares que votaram nulos");
		int votosNulos = sc.nextInt();
		System.out.println("Digite a quantidade total de eleitorares que tiveram votos validos");
		int votosValidos = sc.nextInt();
		
		double percentualVotos = votosBrancos*100/eleitores;
		double percentualNulos = votosNulos*100/eleitores;
		double percentualValidos = votosValidos*100/eleitores;
		
		final int porcentagemValorTotal = 100;
		System.out.println("Digite a quantidade total de eleitorares que tiveram votos validos");
		System.out.println("A porcentagem corresponde a todos os eleitores correspondente"+porcentagemValorTotal +"%");
	}

}
