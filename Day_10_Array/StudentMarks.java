class StudentMarks
{
  public static void main (String args[])
  {
   int [] arr= {12,43,54,87,67,54,0,100,98};
   
   for(int i=0; i<arr.length; i++)
   {
	   if(arr[i]>=60)
	   {
		   System.out.println("First");
	   }
	   else if (arr[i]>=40 && arr[i]<=60)
	   {
		System.out.println("Second");
	   }
       else if (arr[i]>=36)
	   {
		   System.out.println("Threed");
	   }
	   else
	   {
		  System.out.println("Filed");   
	   }
	   
   }
  }
}  
   
  