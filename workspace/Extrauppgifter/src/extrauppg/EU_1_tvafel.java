package extrauppg;

public class EU_1_tvafel {

		
		public static int min(int [] element) throws IllegalArgumentException
		{
			
			if (element.length == 0)
			{throw new IllegalArgumentException ("tom samling");}
			
			//hör ihop med spårutskriften 2:
			int antalVarv = 1;
			
			int[] sekvens = element; //int [] sekvens = new int [element];
			int		antaletPar = sekvens.length /2;
			int		antaletOparadeElement = sekvens.length % 2;
			int		antaletTankbaraElement = antaletPar + antaletOparadeElement;
			int[]	delsekvens = new int[antaletTankbaraElement];
			int		j = 0;
			int		i = 0;
			while (sekvens.length > 1) //while 16 > 0,  While 4 > 0 , while 2 > 0 , while  1 > 0 
			{
				//skilj ur en delsekvens med de tänkbara elementen
				i = 0;
				j = 0;
				while (j < antaletPar) 
				{
					delsekvens[j++] = (sekvens[i] < sekvens[i+1])? sekvens[i] : sekvens[i+1];
					// j++ 
					i +=2;
				}
				
				if(antaletOparadeElement == 1)//om det finns ett ojämnt antal elemtn kommer första platsen 
											// i delsekvensen få värdet av det sista talet i listan 'sekvens'
				{
					delsekvens[j] = sekvens[sekvens.length - 1];// sekvens[antaletPar*2 ]
				}
				
				
				
				sekvens = delsekvens; 
				//elementen i delsekvensen blir nu elementen i huvudsekvensen
				
				antaletPar = antaletTankbaraElement / 2;
				antaletOparadeElement = antaletTankbaraElement % 2;
				antaletTankbaraElement = antaletPar + antaletOparadeElement;
				
				
				

				// spårutskrift 1 – för att följa sekvensen
				 System.out.println (java.util.Arrays.toString (sekvens));
				// spårutskrift 2 - för att avsluta loopen i förväg
				// (för att kunna se vad som händer i början)
				 if (antalVarv++ == 10)
				 System.exit (0);
				
				
				
				
			}
			
			// sekvens[0] är det enda återstående tänkbara elementet // - det är det minsta elementet
			return sekvens[0];
			
		}

	}


