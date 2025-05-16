public class AddNumber // wap to add all number 
{
  public static void main (String args[])
  {
    int n= 1234543999;
	int s= 0;
	int rem;
	
	while(n>0)
	{ 
	  rem=n%10;
	  s= s+rem;
	  n=n/10;
	  
	}
	 System.out.println(s);
  }
}