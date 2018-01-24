package ovning;

import java.util.Scanner;
import java.io.*;

public class PersonligaUppgifter_eget {

	public static void main(String[] args) {
	
	
	Scanner	in = new  Scanner(System.in);
	
			System.out.println("skriv in ålder, tack!");
			int alder = in.nextInt();
			in.nextLine();
			System.out.println("skriv in ditt fulla namn, tack!");
			String namn = in.nextLine();
			
			
			
			
			
			
			try{
			    PrintWriter writer = new PrintWriter("alderochnamn.txt");
			    writer.println("din ålder:\t" + alder);
			    writer.println("ditt namn:\t" + namn);
			    writer.close();
			} catch (Exception e) {
			  
		
			
	}

}
}
