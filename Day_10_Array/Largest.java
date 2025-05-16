class Largest
{
 public static void main (String args[])
 {
   int[] a={12,33,5,554,22,455,5532,53322,6532345};
   //int[] b={134,1,5,554,22,455,5532,53322,6532345};

   int max=a[0];
   int min=a[0];
   for(int i=0;i<a.length;i++)
	   
	  // for(int j=0;j<a.length;j++)
   {
     if(a[i]>max)
	 {
		 max=a[i];
	 }
		else if (a[i]<min)
		{
	      min=a[i];
		}
		
	 }
   
   
   System.out.println("Max= "+max + " Min= " + min);
 
}
}