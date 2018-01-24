package triangeln;

import java.util.Scanner;

public class EnTriangelOchDessCirklar 

{

	public static void main(String[] args) 
	
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv in sidorna på din triangel");
		System.out.println("skriv ut en sida");
		double a = input.nextDouble();
		//System.out.println("skriv ut motsvarande höjd");
		//double h = input.nextDouble();
		System.out.println("skriv ut en andra sida");
		double b = input.nextDouble();
		System.out.println("Skriv ut en sista sida");
		double c = input.nextDouble();
		
		//double svar = Triangel.area (a,h);
		//System.out.println("arean för triangeln är:" + svar);
		
		//double svar2 = Triangel.omkrets(a,b,c);
		//System.out.println("omkretsen för triangeln är:" + svar2);
		
		
		//double v = Triangel.vinkel(a,b,c);
		//System.out.println("mellanliggande vinkeln mellan sida b =" + b + "och sida c ="  + c + "är: " + v + "radianer"); 
		double A = Triangel.arean(a,b,c);
		System.out.println("arean för triangeln är: " + A );
		double svar = Triangel.omcirkel(a, b, c, A);
		System.out.println("radien av den omskrivna cirkeln till triangeln är: " + svar);
		double svaret = Triangel.incirkel(a, b, c, A);
		System.out.println("Radien av den inskrivna cirkeln i triangeln är: " + svaret);
		
		
	}

}
