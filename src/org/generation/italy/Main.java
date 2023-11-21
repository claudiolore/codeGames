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
        HashSet<Integer> estratte=new HashSet<>();    
        ArrayList<String> squadraBlu=new ArrayList<>();
        ArrayList<String> squadraRossa=new ArrayList<>();
	    int random;    
	    System.out.println("Benvenuto a Codegames,\nDividetevi in due squadre e scegliete i capitani");
		
    //decido le parole della squadra BLU
	System.out.println("\nParole squadra BLU:");
	for(int i=0;i<7;i++)
	{	
	    do {
			random= r.nextInt(20); // da 0 a 39
		} 
		while (estratte.contains(random)); // se l'ho già estratta torno indietro
	    
	    estratte.add(random);
	    squadraBlu.add(paroleTotali.get(random)); 
	    System.out.println(paroleTotali.get(random));
	}   
		
		
	 //decido le parole della squadra ROSSA
	System.out.println("\nParole squadra BLU:");
	for(int i=0;i<7;i++)
		{	
	    do {
			random= r.nextInt(20); // da 0 a 39
		} 
		while (estratte.contains(random)); // se l'ho già estratta torno indietro
	    
	    estratte.add(random);
	    squadraRossa.add(paroleTotali.get(random)); 
	    System.out.println(paroleTotali.get(random));
		}   	
		
		
		
		
		
		
		sc.close();
	}
}
