package petStore;

public class Fish extends Animal {
	
	
	private String fishType;
	
	public Fish(String s){
		
		this.fishType = s;
		
	}
	
	public String toString(){
		
		return "a fish of type " + this.fishType;
	}

	
	public void noise(){
		
		System.out.println("blubb");
	}
	
}
