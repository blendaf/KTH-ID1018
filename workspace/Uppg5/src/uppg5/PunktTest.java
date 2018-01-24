package uppg5;

import java.io.*;
public class PunktTest 
{

	
	public static void main (String[] args) 
	
	{
	//Printwriter out = new PrintWriter (System.out, true);

	// testa en konstruktor och en transformator
	Punkt p1 = new Punkt ("A", 3, 4);
	Punkt p2 = new Punkt ("B", 5, 6);
	System.out.println ("punkt 1: "+ p1.toString()  + "   " + "punkt 2:" + p2.toString());
	
	// testa inspektorer
	String n = p1.getNamn ();
	int x = p1.getX ();
	int y = p1.getY ();
	System.out.println (n + " " + x + " " + y);
	
	// testa en kombinator och en komparator 
	double d = p1.avstand (p2); 
	System.out.println ("avståndet mellan punkterna är: " + d + "  l.e");
	boolean b = p1.equals (p2); 
	System.out.println("Är punkterna identiska? " + b);
	// testa mutatorer 
	p2.setX (1); 
	p2.setY (2); 
	System.out.println (p2.toString());
	// testa en konstruktor till 
	Punkt p = new Punkt (p1); 
	System.out.println (p.toString());
	}
	
}
