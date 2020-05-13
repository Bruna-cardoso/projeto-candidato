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
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.println("Digite uma op��o: ");
		escolaridade = sc.nextInt();
		
		// Leitura dos outros dados
		
		System.out.println("Voc� tem quantos anos de experi�ncia profissional? ");
		experiencia = sc.nextInt();
		System.out.println("Voc� tem disponibilidade para viajar (S/N)? ");
		viagem = sc.next().charAt(0);
		System.out.println("Voc� tem habilita��o de motorista (S/N)? ");
		habilitacao = sc.next().charAt(0);
		
		// Escolaridade e experi�ncia
		
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
		System.out.println("Pontos por experi�ncia: " + nivelexperiencia);
				
				
				
		sc.close();

	}

}
