public class Max_Min
{
	
	static int z = 5;
  public static void main (String args[])
  {
	  
	  System.out.println(z);
   int[] a= {10,30,40,11,77,10,25,90,999};
   int max=0;
   int min=0;
   for(int index=0;index<a.length;index++)
   {
     if(max<a[index] && min<a[index])
	 {
	   max=a[index];
	   min=a[index];
	 }
   }
   System.out.println("Max= "+max +" ");
  }
}