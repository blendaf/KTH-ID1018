package test;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String tal1 = "";
		for (int j = 0; j < 5 ; j++)
		{
			int sum = j+1;
			StringBuilder str = new StringBuilder(tal1);
			str.insert(j, sum);
			tal1 = str.toString();
		
		}
		
		System.out.println(tal1);
	}

}
