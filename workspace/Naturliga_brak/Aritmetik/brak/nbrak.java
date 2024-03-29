package brak;

/*
 * 
 * nbrak.java 1.0 2016-01-12
 * 
 */

/**
 * test - naturliga brak
 * @param nominator brakets taljare
 * @param divider brakets namnare
 * @author BlendaFrojdh
 *
 */


public class nbrak implements granssnittTest {

	private int divider;
	private int nominator;
	public nbrak(int nominator, int divider) 
	{
		this.nominator = nominator;
		this.divider = divider;
	}
	
	
	public void forlang (int multiplyer)
	{
		this.nominator = this.nominator*multiplyer;
		this.divider = this.divider*multiplyer;
		
	}
	
	public boolean aktabrak()
	{
		return this.nominator > this.divider;
		
	}
	
	public String toString()
	{
		return this.nominator + " " + "/" + " " + this.divider;
		
	}
	
	
	public boolean heltal()
	{
		return this.nominator % this.divider == 0;
	}
	
	
	public  double add (nbrak b)
	{
		if ( this.divider != b.divider)
		{					
			int n1 = this.nominator * b.divider;
			int n2 = b.nominator * this.divider;
			int d = this.divider * b.divider;
			return (n1+n2) / d;
		}
		
		else 
		{
			return (this.nominator+b.nominator)/this.divider;
			
		}
		
	}
}

