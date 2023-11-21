package org.generation.italy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		ArrayList<String> paroleTotali=new ArrayList<>(); //chatGPT
			paroleTotali.add("Elefante");
	        paroleTotali.add("Avventura");
	        paroleTotali.add("Pancake");
	        paroleTotali.add("Telescopio");
	        paroleTotali.add("Melodia");
	        paroleTotali.add("Giungla");
	        paroleTotali.add("Quadrante");
	        paroleTotali.add("Astronauta");
	        paroleTotali.add("Zenzero");
	        paroleTotali.add("Nebulosa");
	        paroleTotali.add("Caverna");
	        paroleTotali.add("Trottola");
	        paroleTotali.add("Lampadario");
	        paroleTotali.add("Ghiaccio");
	        paroleTotali.add("Sorriso");
	        paroleTotali.add("Cuscino");
	        paroleTotali.add("Radiatore");
	        paroleTotali.add("Conchiglia");
	        paroleTotali.add("Balena");
	        paroleTotali.add("Trampolino");
        
        boolean ripeti=false; 
        HashSet<Integer> estratte=new HashSet<>();    
        ArrayList<String> squadraBlu=new ArrayList<>();
        ArrayList<String> squadraRossa=new ArrayList<>();
	    int random;    
	    System.out.println("Benvenuto a Codegames,\nDividetevi in due squadre e scegliete i capitani");
		
//decido le parole della squadra BLU
	for(int i=0;i<7;i++)
	{	
	    do {
			random= r.nextInt(20); // da 0 a 39
		} 
		while (estratte.contains(random)); // se l'ho già estratta torno indietro
	    
	    estratte.add(random);
	    squadraBlu.add(paroleTotali.get(random)); 
	}   
		
		
//decido le parole della squadra ROSSA
	for(int i=0;i<7;i++)
		{	
	    do {
			random= r.nextInt(20); // da 0 a 39
		} 
		while (estratte.contains(random)); // se l'ho già estratta torno indietro
	    
	    estratte.add(random);
	    squadraRossa.add(paroleTotali.get(random)); 
	    }   	
//stampo le parole
	System.out.println("\nParole squadra BLU:");	
	System.out.println(squadraBlu);	
	
	System.out.println("\nParole squadra ROSSA:");
	System.out.println(squadraRossa);	
	
//inizia la squadra blu
//sceglie l'indizio e le parole associate
	System.out.println("\nCAPITANO BLU: scegli il tuo indizio");
	String indizio=sc.nextLine();
	System.out.println("A quanto parole è collegato?");
	int collegamenti=Integer.parseInt(sc.nextLine());
	
//stampo parole totali disponibili	
	System.out.println("\n"+paroleTotali);
	System.out.println("INDIZIO: "+indizio+" "+collegamenti);
	
//la squadra blu GIOCA	
	System.out.println("\nInserire parola:");	
	String parola="";	
	do {	
		System.out.println("Inserisci una parola");
		parola=sc.nextLine();
		System.out.println("COMPLIMENTI HAI INDOVINATO");
		squadraBlu.remove(parola);
		
		if(squadraBlu.contains(parola))
			ripeti=true;
		
	}while(ripeti==true);
	
	
	//deve PD ripetersi finche la parola appartiene alle parole della squadra blu, rimuovendola
	
	
	
	
	
	
		sc.close();
	}
}
