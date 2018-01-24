package uppg3;

import java.util.Scanner;

public class BestamDenKortasteVagen {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//inmatningsverktyg
		
		System.out.println("Vänligen skriv in antal stationer för linje Z2");
		int m = input.nextInt();
		System.out.println("Vönligen skriv in antal stationer för linje Z3");
		int n = input.nextInt();
		
		
		double [] a = new double[m];
		double [][] b = new double [m][n];
		double []c = new double[n];
		for (int i = 0; i < m; i++)
		{
			System.out.println("Skriv in längden mellan station x och U" + i);
			a[i] = input.nextDouble();
			
		}
		
		
		for (int j = 0; j < m; j++ )
		{
			for (int h = 0; h < n; h++)
			{
				
				System.out.println("Skriv in längden mellan stationen U" + j + " och " + "V"+ h);
				b[j][h] = input.nextDouble();
				
			}
			
		}
		
		for(int g = 0; g < n; g++)
		{
			System.out.println("skriv in längden mellan V" + g + " och Y");
			c[g] = input.nextDouble();
			
		}
		
		
		double kortavagen = DenKortasteVagen.langd(a, b, c);
		int [] mellanstn = DenKortasteVagen.mellanstationer(a, b, c);
		System.out.println("Den kortaste vägen att ta är:" + kortavagen + " meter");
		System.out.println("De mellanstationer som man passerar är då U" + mellanstn[0] + " och V" + mellanstn[1] );
		
	}

}
