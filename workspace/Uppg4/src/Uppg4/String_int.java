package Uppg4;

import java.util.Scanner;

public class String_int {

	  public static void main (String[] args)
	  {
		  Scanner input = new Scanner (System.in);
	    // String s = "fred";  // use this if you want to test the exception below
	   System.out.println("skriv en siffra, tack!");
		String s = input.next();

	    try
	    {
	      // the String to int conversion happens here
	      int i = Integer.parseInt(s.trim());

	      // print out the value after the conversion
	      System.out.println("int i = " + i);
	    }
	    catch (NumberFormatException nfe)
	    {
	      System.out.println("NumberFormatException: " + nfe.getMessage());
	    }
	  }
	
}
