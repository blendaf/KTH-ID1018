package Uppg4;
import java.util.Scanner;
import java.lang.*;
	
public class Subb {

	public static void main(String[] args)
	{
		

	
				
				System.out.println ("OPERATIONER MED NATURLIGA HELTAL GIVNA SOM TECKENSTRANGAR\n");
				// mata in två naturliga heltal
				
				Scanner in = new Scanner (System.in);
				//inmatningsverktyg
				
				
				System.out.println ("två naturliga heltal:"); 
				String tal1 = in.next ();
				String tal2 = in.next ();
				System.out.println();
				
				
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
			
			//int villk = tal1.length();
			//System.out.println(villk);
			String strang = "";
			for(int j = (tal1.length()-1); j >= 0; j --)
			
			
			{
				
				int x = Character.getNumericValue(tal1.charAt(j));
				int y = Character.getNumericValue(tal2.charAt(j));
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
				
				//s.setCharAt()
				
			}
		/*	
			if (z ==1)
			{
				StringBuilder str = new StringBuilder(strang);
				str.insert(i, 1);
				strang = str.toString();	
			}
			
			*/
			
			System.out.println(strang);
			
			
		
	
	}
	
}
