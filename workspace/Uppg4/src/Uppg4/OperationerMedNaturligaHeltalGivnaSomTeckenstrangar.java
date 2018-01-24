package Uppg4;
import java.util.*;

public class OperationerMedNaturligaHeltalGivnaSomTeckenstrangar {

	
		public static void main (String[] args) {
		
		System.out.println ("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRANGAR\n");
		// mata in två naturliga heltal
		
		Scanner in = new Scanner (System.in);
		//inmatningsverktyg
		
		
		System.out.println ("två naturliga heltal:"); 
		String tal1 = in.next ();
		String tal2 = in.next ();
		System.out.println();
		
		
		// addera heltalen och visa resultatet 
		
		String summa = addera (tal1, tal2); 
		//System.out.println("tal 1 :" + tal1 + "tal 2: "+ tal2 + "summan av dessa tal är:" + summa );
		visa(tal1, tal2, summa, '+');
		
		// subtrahera heltalen och visa resultatet
		// koden här 
		
		String differens = subtrahera(tal1, tal2);
		//System.out.println("differensen mellan talen är:" + differens );
		visa (tal1, tal2, differens, '-');
		}
		
		
		// addera tar emot två naturliga heltal givna som teckensträngar, och returnerar deras 
		// summa som en teckensträng.
		
		public static String addera (String tal1, String tal2)
		
		{
									
					//sätter nollor framför det kortare talet så att figurerna hamnar på rätt position
					if (tal1.length() >= tal2.length())
					{
						int diff = tal1.length() - tal2.length();
							
						for (int i = 0; i < diff; i++)
							
						{ 
							StringBuilder str = new StringBuilder(tal2);
							str.insert(0, '0');
							tal2 = str.toString();	
						}
						
					}
					
					else 
					{
						int diff = tal2.length() - tal1.length();
						
						for(int i = 0; i < diff; i++)
						{
							StringBuilder str = new StringBuilder(tal1);
							str.insert(0, '0');
							tal1 = str.toString();
								
						}
						
					}
					//System.out.println(tal1);
					//System.out.println(tal2);
				
				int c = 0;
				int i = 0;
				String strang = "";
				for(int j = (tal1.length()-1); j >= 0; j --)
				
				
				{
					// gör om char till int och addera. 
					int a = Character.getNumericValue(tal1.charAt(j));
					int b = Character.getNumericValue(tal2.charAt(j));
					int sum = a+b+c;
					
					
					if(sum >= 10)
					{
						//om summan >= 10 blir carry 1, c = 1
						
						c = 1;
						int suma = sum - 10;
						StringBuilder str = new StringBuilder(strang);
						str.insert(i, suma);
						strang = str.toString();	
						
					}
					
					else
					{
						//om summa < 10 blir carry 0, c=0
						c = 0;
						StringBuilder str = new StringBuilder(strang);
						str.insert(i, sum);
						strang = str.toString();
						
					}
					
					
				}
				//om det finns en carry på slutet blir char på index 0 = 1
				if (c ==1)
				{
					StringBuilder str = new StringBuilder(strang);
					str.insert(i, 1);
					strang = str.toString();	
				}
				
			return strang;		
							
		}
		
		
		// subtrahera tar emot två naturliga heltal givna som teckensträngar, och returnerar 
		// deras differens som en teckensträng.
		// Det första heltalet är inte mindre än det andra heltalet.
		
		
		
		public static String subtrahera (String tal1, String tal2)
		{
							
							if (tal1.length() >= tal2.length())
							{
								int diff = tal1.length() - tal2.length();
									
								for (int i = 0; i < diff; i++)
									
								{ 
									StringBuilder str = new StringBuilder(tal2);
									str.insert(0, '0');
									tal2 = str.toString();
								
								}
								
							}
							
							else 
							{
								int diff = tal2.length() - tal1.length();
								
								for(int i = 0; i < diff; i++)
								{
									StringBuilder str = new StringBuilder(tal1);
									str.insert(0, '0');
									tal1 = str.toString();
										
								}
								
							}
							System.out.println(tal1);
							System.out.println(tal2);
						
						int z = 0;
						
						
						String strang = "";
						for(int h = (tal1.length()-1); h >= 0; h--)
						
						
						{
							
							int x = Character.getNumericValue(tal1.charAt(h));
							int y = Character.getNumericValue(tal2.charAt(h));
							int dif = x-y-z;
							
							
							if(dif < 0)
							{
								z = 1;
								int diffen = 10 + dif;
								StringBuilder str = new StringBuilder(strang);
								str.insert(0, diffen);
								strang = str.toString();
								
								
							}
							
							else
							{
								z = 0;
								StringBuilder str = new StringBuilder(strang);
								str.insert(0, dif );
								strang = str.toString();
								
							}
							

						
						
					
				
				}
						return strang;
			}


		
		// visa visar två givna naturliga heltal, och resultatet av en aritmetisk operation 
		// utförd i samband med hetalen
		
		
		
		
		
		
		
		
		
		
		public static void visa (String tal1, String tal2, String resultat, char operator) 
		{
			// sätt en lämplig längd på heltalen och resultatet
			int len1 = tal1.length ();
			int len2 = tal2.length();
			int len = resultat.length();
			int maxLen = Math.max(Math.max(len1, len2), len);
			tal1 = sattLen (tal1, maxLen - len1);
			tal2 = sattLen (tal2, maxLen - len2); 
			resultat = sattLen (resultat, maxLen - len);
		
			// visa heltalen och resultatet 
			System.out.println (" " + tal1);
			System.out.println ("" + operator + " " + tal2); 
			for (int i = 0; i < maxLen + 2; i++)
				System.out.print ("-"); 
			System.out.println ();
			System.out.println (" " + resultat + "\n"); 
		}
		
			// sattLen lägger till ett angivet antal mellanslag i början av en given sträng 
		public static String sattLen (String s, int antal)
		{
			StringBuilder sb = new StringBuilder (s); 
			for (int i = 0; i < antal; i++)
				sb.insert (0, " ");
			
			return sb.toString (); 
		} 

}

