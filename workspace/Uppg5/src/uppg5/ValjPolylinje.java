package uppg5;

import java.util.*;

	class ValjPolylinje 
	{
			public static final Random rand = new Random (); 
			public static final int ANTAL_POLYLINJER = 10;
			public static void main (String[] args) 
			
			{
			
			// skapar ett antal slumpmässiga polylinjer
			Polylinje[] polylinjer = new Polylinje[ANTAL_POLYLINJER]; 
			for (int i = 0; i < ANTAL_POLYLINJER; i++)
				polylinjer[i] = slumpPolylinje ();
			
			// visa polylinjerna
			for (int h = 0; h < ANTAL_POLYLINJER; h++)
			{
				System.out.println("polylinje " + (h+1) + polylinjer[h]);
				System.out.println("färg: " + polylinjer[h].getFarg());
				System.out.println("bredd: " + polylinjer[h].getBredd());
				System.out.println("längd: " + polylinjer[h].langd());
				System.out.println();
			}
			
			// bestäm den kortaste av de polylinjer som är gula  
			double kortaste = Double.POSITIVE_INFINITY ;
			int kortasteReferens = 0;
			
			for(int j = 0; j < ANTAL_POLYLINJER; j++)
			{
				if(kortaste >= polylinjer[(j)].langd() && polylinjer[j].getFarg() == "gul")
				{
					kortaste = polylinjer[j].langd();
					kortasteReferens = j;
				}	
			}
				
			if(polylinjer[kortasteReferens].getFarg() == "gul")
			{
				System.out.println("den kortaste, gula polylinjen är: " + kortaste + " l.e");
				System.out.println(polylinjer[kortasteReferens]);
				// visa den valda polylinjen	
			}	
			else 
				System.out.println("det finns ingen polylinje med färgen gul");
			}
			
			
			// slumpPunkt returnerar en punkt med ett slumpmässigt namn, som är en stor bokstav i 
			// det engelska alfabetet, och slumpmässiga koordinater.
			public static Punkt slumpPunkt ()
			{
			
			String n = "" + (char) (65 + rand.nextInt (26)); int x = rand.nextInt (11);
			int y = rand.nextInt (11);
			return new Punkt (n, x, y); 
			
			}
			
			// slumpPolylinje returnerar en slumpmässig polylinje, vars färg är antingen blå, eller röd 
			// eller gul. Namn på polylinjens hörn är stora bokstäver i det engelska alfabetet. Två hörn 
			// kan inte ha samma namn.
			
			public static Polylinje slumpPolylinje ()
			
			{
			// skapar en tom polylinje, och lägg till hörn till den 
			Polylinje polylinje = new Polylinje ();
			int antalHorn = 2 + rand.nextInt (7);
			int antalValdaHorn = 0;
			boolean[] valdaNamn = new boolean[26];
			
			// ett och samma namn kan inte förekomma flera gånger 
			Punkt valdPunkt = null;
			char valtChar = 0;
			//while-loopen fortgår sålänge inte alla hörn har valts
			while (antalValdaHorn < antalHorn)
			
			{
				//valdpunkt får ett nytt slumpat värde, valtChar blir tilldelad
				//punktens namn
				valdPunkt = slumpPunkt();
				valtChar = valdPunkt.getNamn().charAt(0);

				if (!valdaNamn[(int)valtChar - 65])
				//om bokstavens motsvarande boolean-värde = false 
				
				{
					// Ingen punkt med samma namn existerar sedan innan
					valdaNamn[(int)valtChar - 65] = true;
					polylinje.laggTill(valdPunkt);
					antalValdaHorn++;
				}
			}
			
			//Sätter färg
			switch (rand.nextInt(3))
			{
			case 0:
				polylinje.setFarg("blå");
				break;
			case 1:
				polylinje.setFarg("röd");
				break;
			case 2:
				polylinje.setFarg("gul");
				break;
			}
					
				return polylinje;
				
			}
			
			
			
		
			
			
	}

	

