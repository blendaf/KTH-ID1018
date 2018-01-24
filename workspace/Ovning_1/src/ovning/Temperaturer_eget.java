//Temperatur_eget.java

package ovning;
import java.util.*;


public class Temperaturer_eget {

	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	//inmatningsverktyg

	
	System.out.println("skriv in antalet veckor");
	int antaletveckor = input.nextInt();
	System.out.println("skriv in antalet mätningar");
	int antaletmatningar = input.nextInt();
	//frågar efter antalet veckor+mätningar
	
			
	
	double [][] tallist = new double [antaletveckor][antaletmatningar];
	//sparar antalet veckor + mätningar till en array 
	
	
	for (int vecka = 0; vecka < antaletveckor; vecka++ )
	
	{
		System.out.println("temperaturer för vecka:" + (vecka+1));
		for (int matning = 0; matning < antaletmatningar; matning++)
			tallist[vecka][matning] = input.nextDouble();
		System.out.println();
	}
	//ber om temperaturvärden per vecka tills att variabeln 'vecka' är lika stor som antalet platser i första parametern i arayn 'tallist'
	//sparar dessa värden i tallist

	
	System.out.println ("temperaturerna är:");
	for (int vecka = 0; vecka < antaletveckor; vecka++) 
	{

		for (int matning = 0; matning < antaletmatningar; matning++) 
		System.out.print (tallist[vecka][matning] + " ");					
		System.out.println (); 
	}
	System.out.println ();
	//visar temperaturerna
	
	
	double [] min = new double[antaletveckor];
	double [] max = new double[antaletveckor];
	double [] medel = new double[antaletveckor];
	double [] summa = new double[antaletveckor] ;
	double summavecka = 0;
	//skapar arays för minsta och största värdet / vecka samt summan och medelvärdet på mätningarna/vecka
	
	for (int vecka = 0; vecka < antaletveckor; vecka++)
		{
		min[vecka] = tallist[vecka][0];
		max [vecka] = tallist [vecka][0];
		summavecka = 0;
		// sätter första platsen för arrayn för minsta och största värdet
		
		
		
		for ( int matning = 0; matning < antaletmatningar; matning++)
        {
			
			if (tallist[vecka][matning] < min [vecka])
            min [vecka] = tallist[vecka][matning]; 
			//jämför vilket värde som är minst och sätter det på den aktuella platsen i arayn
        	
        
			if (tallist[vecka][matning] > max[vecka])
			max [vecka] = tallist[vecka][matning];								
			//jämför vilket värde som är störst och sätter det i den aktuella platsen i arayn
			
			summavecka  = summavecka + tallist[vecka][matning];
			//sätter variabeln summavecka = variabelns tidigare värde + mätvärdet för aktuell mätning
			
			
        
        }
		
		medel[vecka] = summavecka / antaletmatningar ;
		//räknar ut medeltemperaturen för aktuell vecka och stoppar in det i korrelerande plats i arayn
		summa[vecka] = summavecka;
		//stoppar in summan av veckans temperaturer in i korrelerande plats i arayn
		
		} 
		for(int i = 0; i < antaletveckor; i++){
		System.out.println("Minsta temperaturen för vecka " + (i+1) + ":\t" + min[i]);
		System.out.println("Högsta temperaturen för vecka " + (i+1) + ":\t" + max[i]);
		System.out.println ("Medeltemperaturen för vecka " + (i+1) + ":\t" +  medel[i]);
		System.out.println("Summan av temperaturerna vecka " + (i+1) + ":\t" + summa[i]);
		//printar ut varje veckas högsta, lägsta och medeltemperatur 
		
		
		
		}
		
	
		double minTemp = min[0];
		double maxTemp = max[0];
		double medelTemp = medel[0];
		double summahela = 0;
	
		for (int i = 0; i < antaletveckor; i++)
		{
			
			if (min[i] < minTemp)
				minTemp = min[i];
			//hittar den minsta temperaturen över hela perioden
			if (max[i] > maxTemp)
				maxTemp = max[i];
			//hittar den största temperatruen över hela perioden
			
			summahela = summahela + summa[i];
			//räknar ut summan vecka efter vecka
			
		}
	
	double namnare = (antaletmatningar * antaletveckor);
	medelTemp = summahela/namnare;
	
	// definierar variabeln 'namnare' som det totala antalet mätningar
	System.out.println("Den minsta temperaturen för hela mätperioden är: \t " + minTemp);
	System.out.println("Den största temperaturen för hela mätperioden är: \t" + maxTemp);
	System.out.println("Medeltemperaturen för hela mätperioden är:\t" + medelTemp);
	System.out.println("Summan av temperaturerna för hela mätperioden är:\t" + summahela);
	//printar ut hela periodens högsta, lägsta och medeltemperatur
		
		
		
	
	
			}
		

		

			
		
		
	}


