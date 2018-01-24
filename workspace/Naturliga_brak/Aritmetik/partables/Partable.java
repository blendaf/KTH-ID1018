package partables;

public interface Partable<T> 
{

	// countParts returnerar antalet delar i objektet
	int countParts ();
	
	//getParts returnerar objektets delar i en vektor
	T[] getParts ();
}
