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
		System.out.println("2) Ensino M�dio");
		System.out.println("3) Ensino Superior");
		System.out.println("4) P�s-gradua��o");
		System.out.println("Digite uma op��o: ");
		escolaridade = sc.nextInt();
		
		// Leitura dos outros dados
		
		System.out.println("Voc� tem quantos anos de experi�ncia profissional? ");
		experiencia = sc.nextInt();
		System.out.println("Voc� tem disponibilidade para viajar (S/N)? ");
		viagem = sc.nextInt();
		System.out.println("Voc� tem habilita��o de motorista (S/N)? ");
		habilitacao = sc.nextInt();
		
		
		sc.close();

	}

}
