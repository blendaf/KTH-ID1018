package uppg5;


public class Polylinje {
	
private Punkt[] horn;
private String farg = "svart"; 
private int bredd = 1;

public Polylinje () 
{
this.horn = new Punkt[0]; 
}
public Polylinje (Punkt[] horn) 
{
	
this.horn = new Punkt[horn.length];
for (int i = 0; i < horn.length; i++)
	this.horn[i] = new Punkt (horn[i]);

}
public String toString () 
{
	
	//stringBuilder sb = nre <stringBuilder () --- varför stringbuilder??
	
	String f = "";
	for(int i = 0; i < this.horn.length; i++)
	{
			f +=  "\r" +  "Hörn " + i + ": "+  this.horn[i].getNamn() + ", " + this.horn[i].getX() +  ", " + this.horn[i].getY() ;
	}
	return f;
}


public Punkt[] getHorn ()
{	
Punkt [] hornCopy = new Punkt[this.horn.length];
for (int i = 0; i < this.horn.length; i ++)
	hornCopy[i] = this.horn[i];
return hornCopy  ;
}


public String getFarg () 
{
	return this.farg;
}


public int getBredd () 
{
	return this.bredd;
}


public void setFarg (String farg) 
{
	this.farg = farg;
}


public void setBredd (int bredd) 
{
	this.bredd = bredd;
} 


public double langd() 
{
	double langd = 0;
	for( int i = 1; i < horn.length; i++)
	{
		langd =+ horn[i-1].avstand(horn[i]);
	}
	return langd;
}


public void laggTill (Punkt horn) 
{
Punkt[] h = new Punkt[this.horn.length + 1];

int i = 0;
for (i = 0; i < this.horn.length; i++)
	h[i] = this.horn[i]; 
h[i] = new Punkt (horn);

this.horn = h; 

}
public void laggTillFramfor (Punkt horn, String hornNamn) 

{
boolean insatt = false;
Punkt [] nyLista = new Punkt[this.horn.length + 1];

for (int i = 0; i < this.horn.length ; i ++ )
	{	
	
	if(insatt == false)
			{
				if (hornNamn == this.horn[i].getNamn())
				{	
					nyLista[i+1] = this.horn[i];
					nyLista[i]= horn;
					insatt = true;
				}
				
				
				else 
					nyLista[i] = this.horn[i];	
			}
	else
		nyLista[i+1] = this.horn[i];
				
	}

if (insatt == false)
nyLista[nyLista.length-1] = horn;
this.horn = nyLista;
}
	
public void taBort (String hornNamn) 
{
boolean borttagen = false;
Punkt [] taBort = new Punkt [this.horn.length-1];

for (int i = 0; i < this.horn.length; i++)
{
	if(borttagen == false)
	{
		if (hornNamn == this.horn[i].getNamn())
		{
			borttagen = true;
			continue;	
		}
		else 
			taBort[i] = this.horn[i];
	}
	else 
		taBort[i-1] = this.horn[i];
}	
if(borttagen == false)
this.horn = taBort;
}


public class PolylinjeIterator 

{

	
		private int aktuell = -1;
		public PolylinjeIterator () 
		//konstruktor - skapar ett objekt av typen PolylinjeIterator
		
		{
		if (Polylinje.this.horn.length > 0) 
			aktuell = 0;
		//om det finns hörn i polylinjen sätts variabeln 'aktuell' till 0
		}
		
		public boolean finnsHorn () 
		{
		return aktuell != -1;
		//om aktuell inte är -1 (om det finns hörn) returneras true
		}
		public Punkt horn () throws java.util.NoSuchElementException 
		
		{
		if (!this.finnsHorn ())
		throw new java.util.NoSuchElementException (
		"slut av iterationen");
	
		
		
		Punkt horn = Polylinje.this.horn[aktuell];
		return horn; 
		
		}
		
		public void gaFram () 
		
		{
		if (aktuell >= 0 && aktuell < Polylinje.this.horn.length - 1) aktuell++;
		else
		aktuell = -1;
}
		
}






}