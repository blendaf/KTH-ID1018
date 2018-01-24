package ovning;

public class HanteraTal {

    public static void main (String[] args)
	{
        System.out.println ("HANTERA TAL");
        System.out.println ();

		// inmatningsverktyg
		java.util.Scanner    in = new java.util.Scanner (System.in);
		in.useLocale (java.util.Locale.US);

        // mata in ett antal tal
        double[]    tal = new double[10];
        //skapar en array och kallar den 'tal' och ger den antalet platser 10
        System.out.println ("ange precis 10 tal:");
        for (int pos = 0; pos < tal.length; pos++)
        //skapar variabeln 'pos' och sätter den till 0, så länge den är mindre 
        // än arrayns längd så ska ett tal skrivas in som 
            tal[pos] = in.nextDouble ();

        // bestäm talens summa och medelvärde
        double    sum = 0;
        for (int pos = 0; pos < tal.length; pos++)
             sum = sum + tal[pos];  // sum += tal[pos];
        double    medelVarde = sum / tal.length;

        // best‰m det minsta av talen
        double    min = tal[0];
        for (int pos = 1; pos < tal.length; pos++)
            if (tal[pos] < min)
                min = tal[pos];

        // visa summan, medelv‰rdet och det minsta av talen
        System.out.println ("\ntalens summa: " + sum);
        System.out.println ("talens medelvarde: " + medelVarde);
        System.out.println ("det minsta av talen: " + min);

        // sortera talen i stigande ordning
        int    minPos = 0;
        double    t = 0;
        for (int pos = 0; pos < tal.length - 1; pos++)
        {
			minPos = pos;
			for (int p = pos + 1; p < tal.length; p++)
			    if (tal[p] < tal[minPos])
			        minPos = p;
			t = tal[pos];
			tal[pos] = tal[minPos];
			tal[minPos] = t;
		}

		// visa talen efter sorteringen
		System.out.println ("\ntalen i stigande ordning:");
		for (double q : tal)
		    System.out.print (q + "  ");
		System.out.println ();
	}
}
