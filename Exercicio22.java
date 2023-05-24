package Exercicios;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
System.out.println("Digite a quantidade de horas trabalhadas em um mês:");
		int quantidadeHorasTrabalhadas = sc.nextInt();
		
		System.out.println("Digite o valor recebido por cada hora trabalhada:");
		float valorHora= sc.nextFloat();
		
		if(quantidadeHorasTrabalhadas<161) {
			float salarioFinal=quantidadeHorasTrabalhadas*valorHora;
			System.out.println("O valor a ser recebido é:R$" +salarioFinal);
		}else {
			float salarioFinal=(160*valorHora)+(valorHora + 50/100*valorHora);
			System.out.printf("O valor a ser recebido é:R$ %.2f" ,salarioFinal);
		}
			}

}
