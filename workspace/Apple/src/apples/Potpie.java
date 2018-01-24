package apples;

public class Potpie {
	
	private int year, month, day;
	
	public Potpie(int y, int m, int d)
	{
		this.year = y;
		this.month = m;
		this.day = d;
		
		System.out.printf("The date is %s", this);
		
	}
	
	public String toString() {
		
		return String.format("%d/%d/%d",this.year, this.month, this.day);
		
		
		
	}

}
