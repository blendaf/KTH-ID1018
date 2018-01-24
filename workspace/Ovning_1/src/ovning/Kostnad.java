package ovning;

public class Kostnad {
	
	public static void main (String[] args)
	{
		System.out.println ("KOSTNAD");
		System.out.println ();

		// inmatningsverktyg
		java.util.Scanner    in = new java.util.Scanner (System.in);
		in.useLocale (java.util.Locale.US);

		// mata in uppgifter om antalet bˆcker och deras pris
		System.out.print ("Antalet bocker: ");
		int    antal = in.nextInt ();
 		System.out.print ("Pris pa bockerna: ");
		double    pris = in.nextDouble ();

		// beräkna den totala kostnaden
		double    kostnad = antal * pris;
		// double = flyttal

		// visa resultatet
		System.out.println ("Den totala kostnaden: " + kostnad);
	}
}




