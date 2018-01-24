package ovning;

import java.util.*;
public class HanteraTal_eget {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		        
		        double[]    tallista = new double[2];
		        //skapar en array och kallar den 'tal' och ger den antalet platser 10
		        System.out.println ("skriv in tal");
		        for (int pos = 0; pos < tallista.length; pos++)
		        //skapar variabeln 'pos' och sätter den till 0, så länge den är mindre 
		        // än arrayns längd så ska ett tal skrivas in som 
		            tallista[pos] = in.nextDouble ();
		
		/*Scanner input = new Scanner(System.in);
		
		System.out.println("Olika tal ska skrivas in och medelvärde räknas ut");
		double[] tallista = new double[5];
		//skapar en array med tre platser
		
		System.out.println("skriv in tal");
		for (int tal = 0; tal < tallista.length; tal++);
			tallista[tal] = input.nextDouble();*/

	}

}
