package uppg5;
import java.math.*;

public class Punkt {

	
	private String namnet = "";
	private int kordinatX = 0;
	private int kordinatY = 0;
	public Punkt(String namn, int x, int y)
	
	{
	namnet = namn;
	kordinatX = x;
	kordinatY = y;
		
	}
	
public Punkt(Punkt p)
	
	{
	namnet = p.getNamn() ;
	kordinatX = p.getX();
	kordinatY = p.getY();
		
	}
	
public String toString()
{
	String s ="";
	s =   kordinatX + ", " + kordinatY ;
return s;	
}


	public String getNamn ()
	
	{
		return namnet;
		
	}
	
	
	public int getX ()
	
	{
		return kordinatX;
		
	}
	
	
	public int getY ()
	
	{
		
		return kordinatY;
		
	}
	
	
	
	public int setX(int x_1)
	
	{
		
		this.kordinatX = x_1;
		return this.kordinatX;
		
	}
	
	public int setY(int y_1)
	
	{
		
		this.kordinatY = y_1;
		return this.kordinatY;
	}
	
	
	
	public double avstand(Punkt p)
	
	{
		
		double a = p.getX();
		double b = p.getY();
		double c = kordinatX - a;
		double d = kordinatY - b;
		double avst = Math.sqrt((c*c)+(d*d));
		return avst;
		
	}
	
	public boolean equals(Punkt p)
	
	{
		if (p.getX() == kordinatX && p.getNamn() == namnet && p.getY() == kordinatY )
		{
		return true;
					
		}
		else
		
		{
			return false;
			
		}
		
	}
	
	
}
