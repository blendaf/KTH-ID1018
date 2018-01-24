package uppg5;

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

for (int i = 0; i < hornen.length; i++)
	
