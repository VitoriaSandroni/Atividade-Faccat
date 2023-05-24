package Exercicios;

import java.util.Scanner;

public class exercicio21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int horainicio=24;
		int horaFinal=24;
		
		while ((horainicio<0)|| (horainicio>23)){
			System.out.println("Digite o horario inicio da partida de Xadrez");
			horainicio= sc.nextInt();
		}
		while((horaFinal<0)||(horaFinal>23)) {
			System.out.println("Digite o horario final da partida de Xadrez");
			horaFinal = sc.nextInt();
		}
		System.out.println("Digite o horario inicio da partida de Xadrez");
		horainicio=sc.nextInt();
		System.out.println("Digite o horario final da partida de Xadrez");
		int horafinal=sc.nextInt();
		int quantidadedeHorasJogo = horafinal - horainicio;
		if (quantidadedeHorasJogo<0) {
			quantidadedeHorasJogo=quantidadedeHorasJogo+24;
			System.out.println("A quantidade de horas jogo corresponde a:"+quantidadedeHorasJogo);
		}else if (quantidadedeHorasJogo==0) {
			System.out.println("Fim de jogo, chegou a 24h de jogo");
		}else{
			
			System.out.println("A quantidade de horas jogo corresponde a:"+quantidadedeHorasJogo);
		}
		
		
		
		

	}

}
