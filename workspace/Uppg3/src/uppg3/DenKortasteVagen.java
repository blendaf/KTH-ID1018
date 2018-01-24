package uppg3;

public class DenKortasteVagen {

	
 public static int[] mellanstationer(double[] a, double[][] b, double []c)
 
 {
	 int[] mellanstationer = new int[2];
	 double summa = a[0]+b[0][0]+c[0];
	 
	 for (int i = 0; i < a.length; i++)
	 {
		 
		 for (int j=0; j < b [i].length; j++)
			 
		 {
			 if (summa > a[i] + b[i][j] + c[j])
			 {
				summa = a[i] + b[i][j] + c[j]; 
				mellanstationer[0]=i;
				mellanstationer[1]=j;
			 }

			
		 }
	 }
	 
	 return mellanstationer;
	
 } 
	 
 public static double langd (double[] a, double[][] b, double[] c)
 
 {
	
	 double langd = a[0]+b[0][0]+c[0];
	 
	 for (int i = 0; i < a.length; i++)
	 {
		 
		 for (int j=0; j < b [i].length; j++)
			 
		 {
			 if (langd > a[i] + b[i][j] + c[j])
			 {
				langd = a[i] + b[i][j] + c[j]; 
			
			 }
 
		 }
	 
	 }
	 
	 return langd;
}
 
 
}