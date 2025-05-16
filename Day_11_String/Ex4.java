class  Ex4
{
 public static void main (String args[])
 {  
 withoutloop(1);
 }
   public static  void withoutloop(int i)
   {
	   if(i<=10)
	   {
		   System.out.println(i);
		   withoutloop (i+1);
		   
	   }
   }
 
}