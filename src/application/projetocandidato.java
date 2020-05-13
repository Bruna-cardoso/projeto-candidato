package application;

import java.util.Locale;
import java.util.Scanner;

public class projetocandidato {

	public static void main(String[] args) {	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int escolaridade, experiencia, viagem, habilitacao;
		
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
		viagem = sc.nextInt();
		System.out.println("Você tem habilitação de motorista (S/N)? ");
		habilitacao = sc.nextInt();
		
		
		sc.close();

	}

}
