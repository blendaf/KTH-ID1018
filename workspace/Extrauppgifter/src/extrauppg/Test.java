package extrauppg;
import java.util.*;

public class Test {

	public static void main(String[] args) {
		
		int [] tal = new int [16];
		
	/*/	for (int i = 0; i < tal.length; i++)
		{
			tal [i] = randomGenerator.nextInt(100);
		}
		*/
		
		tal[0] = 5 ;
		tal[1] = 6 ;
		tal[2] = 2 ;
		tal[3] = 3 ;
		tal[4] = 4 ;
		tal[5] = 2 ;
		tal[6] = 56 ;
		tal[7] = 4 ;
		tal[8] = 1 ;
		tal[9] = 34 ;
		tal[10] = 12 ;
		tal[11] = 8 ;
		tal[12] = 56 ;
		tal[13] = 89 ;
		tal[14] = 5 ;
		tal[15] = 8 ;
		//int minstatalet = EU_1_tvafel.min(tal);
		int minstatalet = EU1.min(tal);
		System.out.println(minstatalet);

	}

}
