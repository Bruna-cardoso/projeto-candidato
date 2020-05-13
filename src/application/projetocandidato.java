package application;

import java.util.Locale;
import java.util.Scanner;

public class projetocandidato {

	public static void main(String[] args) {	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int escolaridade, experiencia, nivelescolar, nivelexperiencia;
		char viagem, habilitacao;
		
		// Leitura da escolaridade
		
		System.out.println("Qual sua escolaridade?");
		System.out.println("1) Ensino Fundamental");
		System.out.println("2) Ensino Médio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) Pós-graduação");
		System.out.println("Digite uma opção: ");
		escolaridade = sc.nextInt();
		
		// Leitura dos outros dados
		
		System.out.println("Você tem quantos anos de experiência profissional? ");
		experiencia = sc.nextInt();
		System.out.println("Você tem disponibilidade para viajar (S/N)? ");
		viagem = sc.next().charAt(0);
		System.out.println("Você tem habilitação de motorista (S/N)? ");
		habilitacao = sc.next().charAt(0);
		
		// Escolaridade e experiência
		
		if (escolaridade == 1) {
			nivelescolar = 10;
		}
		else if (escolaridade == 2) {
			nivelescolar = 20;
		}
		else if (escolaridade == 3) {
			nivelescolar = 30;
		}
		else {
			nivelescolar = 40;
		}
		
		if (experiencia == 0) {
			nivelexperiencia = 0;
		}
		else if (experiencia > 0 && experiencia <= 2) {
			nivelexperiencia = 10;
		}
		else if (experiencia > 2 && experiencia <= 5) {
			nivelexperiencia = 20;
		}
		else {
			nivelexperiencia = 40;
		}
		
		System.out.println("Pontos por escolaridade: " + nivelescolar);
		System.out.println("Pontos por experiência: " + nivelexperiencia);
				
				
				
		sc.close();

	}

}
