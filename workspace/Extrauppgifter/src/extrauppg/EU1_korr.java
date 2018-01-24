package extrauppg;

public class EU1_korr {
		
		public static int min(int [] element) throws IllegalArgumentException
		{
			
			if (element.length == 0)
			{throw new IllegalArgumentException ("tom samling");}
			
			//hör ihop med spårutskriften 2:
			//int antalVarv = 1;
			
			int[] sekvens = element; //int [] sekvens = new int [element];
			int		antaletPar = sekvens.length /2;
			int		antaletOparadeElement = sekvens.length % 2;
			int		antaletTankbaraElement = antaletPar + antaletOparadeElement;
			int[]	delsekvens = new int[antaletTankbaraElement];
			int		j = 0;
			int		i = 0;
			while (sekvens.length > 1) //while 16 > 1,  While 4 > 1 , while 2 > 1 . 
			{
				//skilj ur en delsekvens med de tänkbara elementen
				i = 0;
				j = 0;
				while (j < antaletPar) //så länge j < 8 kommer loopen fortsätta 
										// j borde därför öka  med 1 värde för varje gång genom loopen
				{
					delsekvens[j] = (sekvens[i] < sekvens[i+1])? sekvens[i] : sekvens[i+1];
					 
					i +=2;
					j++; /// j måste öka värde i en while loop - annars går den förevigt
				}
				
				if(antaletOparadeElement == 1)
				{
					delsekvens[delsekvens.length -1] = sekvens[sekvens.length - 1]; //****** 
					//om ojämnt antal element -> sista elementet hamnar på sista platsen i DS
				}
				
				
				
				sekvens = delsekvens; 
				//elementen i delsekvensen blir nu elementen i huvudsekvensen
				
				antaletPar = antaletTankbaraElement / 2;
				antaletOparadeElement = antaletTankbaraElement % 2;
				antaletTankbaraElement = antaletPar + antaletOparadeElement;
				//en ny delsekvens måste skapas ***** delsekvens2 [antaletTankbaraElement]
				
				

				// spårutskrift 1 – för att följa sekvensen
				// System.out.println (java.util.Arrays.toString (sekvens));
				// spårutskrift 2 - för att avsluta loopen i förväg
				// (för att kunna se vad som händer i början)
				// if (antalVarv++ == 10)
				// System.exit (0);
				
				
				
				
			}
			
			// sekvens[0] är det enda återstående tänkbara elementet // - det är det minsta elementet
			return sekvens[0];
			
		}

	}



