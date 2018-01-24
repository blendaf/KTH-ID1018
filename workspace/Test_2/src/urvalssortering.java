
public class urvalssortering {

	public static void main(String[] args)
	{
		
		
		int [] v1 = {3 , 5 , 6 , 7};
		int [] v2 = {5,7,8,9,10,8,9};
		
		int [] v = new int[v1.length + v2.length];
		int i = 0;
		
		while(i < v1.length)
		{
			v[i] = v1[i];
			i++;
		}
		

		for (int j = 0; j < v2.length; j++)
		{
			v[i++] = v2[j];		
		}
		
		for (int h = 0; h < v.length; h++)
		{
			System.out.print(v[h]);
			
		}
		
		System.out.println();
		
		int minst = 0;
		int sist = v.length -1;
		
		for(int forst = 0; forst < sist; forst++)
		{
		
		minst = forst;
		for (int a = forst+1 ; a <= sist; a++)
		{
			if(v[a]< v[minst])
			{
				minst = a;
			}
			
		}
		
		int e = v[minst];
		v[minst] = v[forst];
		v[forst]=e;
		
		
		}
	
	
	for (int h = 0; h < v.length; h++)
	{
		System.out.print(v[h]+ " ");
		
	}
	
	}
	
}
