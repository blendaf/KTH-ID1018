package apples;


import java.util.Scanner;
public class Apple {
	
	public static void main(String [] args)
	{

	Scanner input = new Scanner(System.in);
	System.out.println("Write your year, month and date");
	Potpie p1 = new Potpie (input.nextInt(), input.nextInt(), input.nextInt());
	System.out.println();
	
	System.out.println("Write your name please");
	System.out.println();
	Scanner in = new Scanner(System.in);
	Tuna info = new Tuna(in.nextLine() , p1);
	System.out.println(info.toString());
	System.out.println(input.nextInt());

	}
}
