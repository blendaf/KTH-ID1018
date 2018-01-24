
/* ******* Föreläsning 1 30/10 -  Skriva, kompilera *********


 - klassers namnm måste börja med en versal och får ej börja med en siffra. 
 -  
*/


package Forelasningar; //definierar paketet

import java.util.Scanner;

public class forelasning_1 {

	public static void main(String[] args) {
		System.out.println("skriv in ett heltal tack!");
		Scanner		in = new Scanner (System.in);
		int hej = in.nextInt();
		System.out.println(hej);
		
		
		
		
		
// ********* Föreläsning 2 2/11 *********
		
		
		
		System.out.print("långa tal kan skrivas med mellanrum på detta sätt: " + 1_000_000);
		// 'final' innan en variabel innebär att variabelns värde inte kan ändras ex:
		final int konstant = 4;
		//konstant = 5; ger fel
		System.out.println(konstant);
		
		//långa tal så ska 'long' användas 'L' måste finnas på slutet
		//exempel:
		long u = 150000000000000000L;
		System.out.println(u);
		//det finns 4 olika typer av datatyper för heltal. Skillnaden är hur många byte som används
		byte b = 45;
		short s = 6666;
		int i = 245345345;
		long l = 150000000000000L;
		//en int kan göras till en float, men inte tvärtom
		//en float kan göras till en double, men inte tvärtom
		//jag kan dock kräva att göra om en double till en integer exempel.
		double w = 3.5;
		System.out.println("w är ett flyttal men tvingas bli ett helttal när man skriver 'int g = (int) w;', "
				+ "\r w är för tillfället: " + w);
		int g = (int) w;
		System.out.println("w blir då till g som är; "+ g);
		
		//jag kan fråga vilket största värdet som är möjligt för de olika datatyperna
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//eller:
		System.out.println(Byte.MAX_VALUE);
		//etc.
		
		
		//det finns två olika datatyper för decimaltal/flyttal
		double d = 1233433.01122;
		float f = -1.6F;
		// en float måste avslutas med F
		
		
		System.out.println(b );
		//char representaerar ett tecken, en char kan inte vara ett negativt värde. 
		char ch1 = 65;
		
		System.out.println(ch1);
		// alla bokstäver i alfabetet har en kordinat, det finns en separat kordinat för versalen resp. gemenen 
		//exempel
		char G = 71;
		System.out.println(G);
		
		
		//det finns 8 primitiva datatyper
		boolean b1 = true;
		boolean b2 = false ;
		if (5 > 3) 
		{System.out.print(b1);}
		
		
		//************ Föreläsning 3 3/11 **************//
		
		
		/* om jag vill att det som skrivs in ska anpassa sig efter det geografiska området skriver jag; 
		' in.useLocale (java.util.Locale.US);  '
		scanner-funktionen kan skapas genom att direkt i koden anropa den. 
		 på detta sätt: '     java.util.Scanner input = new java.util.Scanner (System.in);    '
		 men genom att importera klassen i början av koden, behöver inte funktionen upprepas
		på detta sätt: ' import java.util.Scanner; '
		och sedan senare i koden skriva: Scanner input = new Scanner(System.in), där 'input'  är en benämning som kan ändras */
		
		
		//division av två heltal kommer ge ett svar i form av ett heltal 
		// för att få ett svar med decimaler måste både täljare och nämnare vara flyttal
		//exempel
		int taljare = 5;
		int namnare = 3;
		double k = taljare/namnare; 
		System.out.println("kvoten av a och b kommer ge " +  k + " då täljaren och nämnaren är heltal ");;
		double t = 5;
		double p = 3;
		double o = t/p;
		System.out.println("för att få en kvot med decimaltal måste både täljare \r"
				+ " och nämnare vara i form av flyttal och då blir svaret = " + o);
				
		//räkneoperationer kan endast göras om man använder samma datatyp ex: short + short
		
		
		//*************Föreläsning 4 8/11 ************//
		
		
		// ett villkor måste bindas in med '{}' och ett vanligt misstag är att skära av villkoret från följden med ';'
		 
		int variabel = 5;
		//exempel 
		//if (variabel > 4); - rätt är:
		if (variabel > 4)
		{
			System.out.println("detta skrivs ut så länge villkoret gäller");
			
		}
		
		//några booleanska uttryck:
		// b! = ej b
		// b && c = b och c
		// a || d = a eller d
		// b == c = b lika med c
		// b >= c = b större eller lika med c
		// b <= c = b mindre eller lika med c
		
		//'else if' operationer kan utföras, dessa måste då stå i ordning. exempel:
		
		if (variabel==1)
		{
			variabel = 5;
			System.out.println(variabel);
		}
		
		else if (variabel == 2)
		{
			
		}
		
		else if (variabel == 3)
			
		{
			
		}
		
		else 
		{
			
		}
		
		//vid användning av snabboperatorer (ex &&)
		//måste man tänka på att anända exempelvis funktioner m++ EFTER villkoret
		//exempel bör detta undvikas :
		if (variabel > 4 && variabel++ > 5)
		{
			
		}
		//istället bör man skriva:
		if (variabel > 4 && variabel <=5)
		{
			variabel++;
		}
	
		//bestäm det större av talen
		int mm = 4;
		int nn = 3;
		
		int max = (mm > nn)? mm : nn;
		// om mm är större än nn är resultatet mm annars är resultatet nn
		int min = (mm < nn)? mm : nn+3;
		System.out.println("iom att villkoret inte stämde skrivs nn+3 ut alltså 3+3 vilket är:" + min);
		//man kan också returnera en sträng
		//exempelvis:
		String str  = (mm == nn)? "hej" : "hallå";
		System.out.println("även strängar kan skrivas ut exempelvis:" + str);
		
		//med en switch sats så kan du be användaren att välja ett alternativ och utföra det 
		//detta alternativ kan endast vara ett heltal, sträng, eller tecken ex:
		System.out.println("skriv in hur du ska hälsa 1-2");
		int val = in.nextInt();
		switch (val)
		{
		case 1:
			System.out.println("hej");
			break;
		case 2:
			System.out.println("hallå");
			break;
		}	
		
		System.out.println("vad ska sägas sen?");
		String valet = in.nextLine();
		System.out.println(valet);
		switch (valet)
		{
		case "ett":
			System.out.println("tal ett");
			break;
		case "två":
			System.out.println("tal två");
			break;
		
		}
		
	}
	

}





