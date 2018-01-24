package uppg5;

import java.util.*;


public class PolylinjeTest
{
	public static void main (String[] args) 
	{
		//skapar punkter
		Punkt p0 = new Punkt("A",4,7);
		Punkt p1 = new Punkt("B",5,8);
		Punkt p2 = new Punkt("C",4,90);
		Punkt p3 = new Punkt("D",3,57);
		Punkt p4 = new Punkt("E",6,6);
		Punkt laggTill = new Punkt("H", 87, 3);
		String f = "D";
		
		//lägger till punkter i en lista
		Punkt [] hornen = new Punkt[5];
		hornen[0] = p0;
		hornen[1] = p1;
		hornen[2] = p2;
		hornen[3] = p3;
		hornen[4] = p4;
		
	//skapar en polylinje utifrån punkterna	
	Polylinje poly1 = new Polylinje(hornen);
	System.out.println(poly1.getBredd());
	System.out.println(poly1.getFarg());
	System.out.println(poly1.toString());
	
	//byter färg och bredd
	poly1.setBredd(6);
	System.out.println(poly1.getBredd());
	poly1.setFarg("grön");
	System.out.println(poly1.getFarg());
	
	
	//gör en kopia av polylinjen 
	Punkt [] hornenKopia = poly1.getHorn();
	Polylinje poly1Kopia = new Polylinje(hornenKopia);
	System.out.println("kopian på polylinjen: " + poly1Kopia);	
	
	
	
	//skriver ut polylinjen
	System.out.println(poly1);
	//tar bort ett hörn
	poly1.taBort("B");
	System.out.println(poly1);
	// lägger till hörn framför ett annat
	poly1.laggTillFramfor(laggTill, f);
	System.out.println(poly1);	
	//lägger till ett hörn
	poly1.laggTill(p4);
	System.out.println("efter tillagd punkt:"+ poly1);
	
	
	Polylinje.PolylinjeIterator poly1Iterator =  poly1.new PolylinjeIterator();
	
	
	
	while (poly1Iterator.finnsHorn())
	{
		System.out.println(poly1Iterator.horn());
		poly1Iterator.gaFram();
	}
			
		
	
	
	/*for (int a = 0; a <5 ; a++)
	{
		int xKordinat = hornen[a].getX();
		int yKordinat = hornen[a].getY();
		String namn = hornen[a].getNamn();
		*/
	}
	
		
	}
	
	
	
	
