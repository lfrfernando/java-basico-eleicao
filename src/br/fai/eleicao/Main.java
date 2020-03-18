package br.fai.eleicao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main app = new Main();
		app.start();

	}

	private void start() {
		// TODO Auto-generated method stub
		 Scanner scam = new Scanner(System.in);
		 int voto;
		 
		 Candidatos primeirocandidato = new Candidatos();
		 Candidatos segundocandidato = new Candidatos();
		 Candidatos terceirocandidato = new Candidatos();
		 Candidatos quartocandidato = new Candidatos();
		 Candidatos quintocandidato = new Candidatos();
		 
		 System.out.println("Bem vido as eleicões!");
		 
		 List<Candidatos> listadeCandidatos = new ArrayList<Candidatos>();
		 listadeCandidatos.add(primeirocandidato);
		 listadeCandidatos.add(segundocandidato);
		 listadeCandidatos.add(terceirocandidato);
		 listadeCandidatos.add(quartocandidato);
		 listadeCandidatos.add(quintocandidato);
		 
		
		 System.out.println("Digite seu voto:");
		 voto = scam.nextInt();
		
			while(voto != 0) {
			 
			 
		    }	 
			 
		
		System.out.println("fim da elição:");
	}
		
}




