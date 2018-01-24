package triangeln;

import java.lang.Math;

public class Triangel {



//arean av triangeln mha bas och höjd	
public static double area(double a, double hojd)
{

	double area = a * hojd;
	return(area);
	
}

//omkretsen av triangeln
public static double omkrets(double a, double b, double c)
{
	double omkrets = a + b + c;
	return(omkrets);
	
}

//bisektris 
public static double bisa(double b, double c, double alfa) //b,c, alfa är lokala variabler!
{
			double p = 2 * b * c * Math.cos (alfa / 2); 
			double bisa = p / (b + c);
			return bisa;
}



//beräknar vinkeln mellan sida b och c
public static double vinkel(double a, double b, double c)
{
		
	double vinkel = Math.acos((a*a - b*b - c*c) / (-2*b*c));
	return vinkel;

}


//beräknar arean mha alla sidor
public static double arean(double a, double b, double c)
{
	
double arean = (b*c* Math.sin(Math.acos(( b*b + c*c - a*a) / (2*b*c))))/2;
return arean;

}


//omskrivna cirkelns radie
public static double omcirkel(double a, double b, double c, double A)
{
	
double radius = a*b*c/(A*4);
return radius;

}


//inskrivna cirkelns radie
public static double incirkel(double a, double b, double c, double A)

{
	
double s = (a+b+c)/2;	
double radie = A/s;
return radie;

}


}