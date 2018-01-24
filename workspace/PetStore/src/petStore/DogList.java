package petStore;

public class DogList {
	
	private Dog[] dList = new Dog[6];
	private int index = 0;
	
	public void add(Dog d){
		if(index < dList.length)
		{
			dList[index]=d;
			System.out.println("Dog added at index" + index);
			index++;
		}
		
		else{
			System.out.println("The list is already full");
			
		}
	}

}
