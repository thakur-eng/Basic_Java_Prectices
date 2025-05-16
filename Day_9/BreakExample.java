public class BreakExample 
{
  public static void main (String agrs[])
  {
    for (int i= 1; i<=10; i++)
	{
	   if (i==6)
	   {
	     break;
	   }
	   System.out.println("i:"+ i);
	}
	System.out.println("Loop has ended");
  }
}