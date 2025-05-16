public class ProveNumberPerfect // wap to prove a number perfect or not 
{
  public static void main(String args [])
   {
     int n= 28;
	 int s=0;
	 int m=1;
	 int rem;
	 while(n>0)
	  {
	    rem=n%10;
		s=s+rem;
		m=n*rem;
		n=n/10;
		
		if (s==m)
		
		  System.out.println("Perfect");
		  
		
		else
		
		  System.out.println("Not Perfect");
		  
		
		
	  }
   }
}