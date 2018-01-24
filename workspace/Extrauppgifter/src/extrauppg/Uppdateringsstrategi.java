package extrauppg;

public class Uppdateringsstrategi {

	
	public static int min(int [] element)	//endast heltal finns i arrayn
	{
		
		if (element.length == 0)
		{throw new IllegalArgumentException ("tom samling");}
		
		int min = element[0];
		 
		for (int i = 1; i < element.length; i++)
		{
			
			min = (min > element[i])? element[i]: min;
			
		}
		
		return min;
		
	}
}
