package ovning;



//PersonligaUppgifter.java

//ett program som hanterar personliga uppgifter




class PersonligaUppgifter
{
 public static void main (String[] args)
                         throws Exception  // (1)   tar bort allt vi inte har definierat
	{
		System.out.println ("PERSONLIGA UPPGIFTER");
		System.out.println ();

		// inmatningsverktyg
		java.util.Scanner    in = new java.util.Scanner (System.in);

		// mata in personliga uppgifter
		System.out.print ("Fodelsear: ");
		int    ar = in.nextInt ();
		in.nextLine ();    // (2) in.nextLine gör att den hoppar över en rad. genom att lägga in en tom sådan hoppar vi inte över den rad
		// vi behöver. 
		System.out.print ("Ditt fornamn och efternamn: ");
		String    namn = in.nextLine();
		System.out.println ();

		// spara uppgifter i en fil
		java.io.PrintWriter    fout = 
		          new java.io.PrintWriter ("persUpp.txt");
		fout.println (namn + ": " + ar);
		fout.flush ();

		// ett meddelande
		System.out.println ("Oppna filen persUpp.txt!");
	}
}
