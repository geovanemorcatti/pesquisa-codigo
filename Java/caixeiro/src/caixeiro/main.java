package caixeiro;

import java.util.ArrayList;
import java.util.Scanner;




public class Main {	
	
	/**
	 * main
	 */
	ArrayList<ArrayList<Integer>> Distacia=new ArrayList<ArrayList<Integer>>();
	int NumeroDeCidades =2;
	public static void main(String[] args) {
		boolean stop = true;
		System.out.println("\tProblema do Caixeiro Viajante (PCV)\n");
		System.out.println("Informe o caminho completo do arquivo de entrada:");
		
		Scanner userInput = new Scanner(System.in);
		String inputFile = userInput.nextLine().replace("\\", "\\\\");
		
		
		Problema problema = new Problema(NumeroDeCidades, Distancia);
		System.out.println("\nInformaçăo:\n" + problema.toS());
		
		AlgoritmoGuloso algoritmoGuloso = new AlgoritmoGuloso();
		Heuristica heuristica = new Heuristica();
		Solucao solucao = new Solucao();
		
		while (stop) {
			System.out.println("\nOpçőes:\n1. Força Bruta.\n2. Algoritmo Guloso.\n3. Heurística.\n4. Executar Todos.\n0. Sair");
			switch (userInput.nextInt()) {
			case 1:
				System.out.println("\nForça Bruta: ");
				solucao = algoritmoGuloso.solucao(problema);
				//solucao = forcaBruta.solucao(problema, solucao);
				System.out.println(solucao.toS());
				break;
			case 2:
				System.out.println("\nAlgoritmo Guloso: ");
				solucao = algoritmoGuloso.solucao(problema);
				System.out.println(solucao.toS());
				break;
			case 3:
				System.out.println("\nHeurística: ");
				solucao = heuristica.solucao(problema);
				System.out.println(solucao.toS());
				break;
			case 4:
				System.out.println("\nForça Bruta: ");
				//solucao = forcaBruta.solucao(problema, solucao);
				System.out.println(solucao.toS());
				System.out.println("\nAlgoritmo Guloso: ");
				solucao = algoritmoGuloso.solucao(problema);
				System.out.println(solucao.toS());
				System.out.println("\nHeurística: ");
				solucao = heuristica.solucao(problema);
				System.out.println(solucao.toS());
				break;
			case 0:
				stop = false;
				break;
			default:
				System.out.println("Erro!Escolha uma opçăo válida.");
				break;
			}
		}
		userInput.close();
	}
}