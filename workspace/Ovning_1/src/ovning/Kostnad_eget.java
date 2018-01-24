
package ovning;

import java.util.Scanner;
//importerar skannerfunktionen

public class Kostnad_eget {
	
	public static void main (String[] args)
	{
		System.out.println("Beräkning av totalsumma av era varor");
		//definiera funktionen av koden
		
		Scanner input = new Scanner(System.in);
		//definierar variabeln 'input' till det som skrivs in av användaren
		input.useLocale(java.util.Locale.US);
		//nu anpassas input efter ett geografisk område (i detta fall usa, där man skriver decimaltal med punkt istället för komma)
		
		System.out.println("Skriv in antal av varan:");
		int antal = input.nextInt();
		//sätter varibeln 'antal' som heltalet som skrivs in
		System.out.println("Skriv in pris på varan:");
		double pris = input.nextDouble();
		//sätter variabeln 'pris' som flyttalet som skrivs in
		
		
		double summa = antal * pris;
		//räknar ut flyttalet 'summa'
	
		System.out.print(summa);
		//printar ut 'summa'
	}
} 