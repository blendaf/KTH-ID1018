package uppg5;

public class Polylinje1Test {

	public static void main(String[] args) {
		
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
	Polylinje1 poly1 = new Polylinje1(hornen);
	System.out.println(poly1.getBredd());
	System.out.println(poly1.getFarg());
	System.out.println(poly1.toString());
	
	
	//gör en kopia av polylinjen 
	Punkt [] hornenKopia = poly1.getHorn();
	Polylinje poly1Kopia = new Polylinje(hornenKopia);
	System.out.println("kopian på polylinjen: " + poly1Kopia);	

	}

}
