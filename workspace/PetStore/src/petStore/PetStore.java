package petStore;


public class PetStore {
	
	public static void main(String[] args){
		
		DogList dLi = new DogList();
		Dog d = new Dog("Collie");
		dLi.add(d);
	
		
		
		AnimalList aListObject = new AnimalList();
		Dog d1 = new Dog("collie");
		Dog d2 = new Dog("spaniel");
		Dog d3 = new Dog("labrador");
		Dog d4 = new Dog("poodle");
		Fish f1 = new Fish("goldfish");
		Fish f2 = new Fish("guppy");
		Fish f3 = new Fish("blowfish");
		aListObject.add(d1);
		aListObject.add(d2);
		aListObject.add(f1);
		aListObject.add(f2);
		aListObject.add(f3);
		aListObject.add(d3);
		aListObject.add(d4);
		for(int i = 0; i < aListObject.len(); i ++)
		{
			System.out.println("It's a: "+ aListObject.getAnimal(i).toString());
			
			
			
		}
		
		for(int j =0; j < aListObject.len(); j++){
			aListObject.getAnimal(j).noise();
		}
		
		
		
		
		
		
	}

}
