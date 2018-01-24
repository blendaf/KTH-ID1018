
public class sortering {

	
	public static int[] sammanfoga (int[] v1, int[] v2)
	{
		int[] v = new int[v1.length + v2.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while (i < v1.length  && j < v2.length)
		{
			if (v1[i] < v2[j])
			{
				v[k++] = v1[i++];
				
			}
			
			else 
			{
				v[k++] = v2[j++];
			}
		}
		
		while (i < v1.length)
			v[k++]= v1[i++];
		
		while (j < v2.length)
			v[k++] = v2[j++];
		
		
		
		
		return v;
	}
	
	public static void main(String[] args) {
		
		
		int [] v1 = {4,6,8,1,3};
		int [] v2 = {5,2,8,5,6,3,6,7};
		
		int[] v = sammanfoga(v1, v2);
		for (int i = 0; i < v.length; i++)
			System.out.println(v[i]);
		int b = 6;
		int c = 7;
		System.out.println(b+c);
		
		
		
		

	}

}
