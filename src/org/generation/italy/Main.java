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
	
//la squadra BLU gioca 	
	System.out.println("\nInserire parola:");	
	String parola="";	
	do {	
		parola=sc.nextLine();
		if(squadraBlu.contains(parola))
		{
			System.out.println("\nCOMPLIMENTI HAI INDOVINATO");
			squadraBlu.remove(parola);
			System.out.println("Inserisci NUOVA parola");
			ripeti=true;
			System.out.println("Parole mancanti: "+squadraBlu.size());
		}
		else 
		{
			System.out.println("Errore");
		}
	}while(ripeti==true);
	
//la squadra ROSSA gioca	
	System.out.println("\nInserire parola:");	
	parola="";	
	do {	
		parola=sc.nextLine();
		if(squadraRossa.contains(parola))
		{
			System.out.println("\nCOMPLIMENTI HAI INDOVINATO");
			squadraRossa.remove(parola);
			System.out.println("Inserisci NUOVA parola");
			ripeti=true;
			System.out.println("Parole mancanti: "+squadraRossa.size());
		}
		else 
		{
			System.out.println("Errore, il turno passa agli avversari");
		}
	}while(ripeti==true);	
	
	
	
	
	System.out.println("sono qui");
		sc.close();
	}
}
