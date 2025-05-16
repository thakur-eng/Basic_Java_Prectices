/*public class Prectice  
{
public static void main (String args [])
{
  Prectice mc = new Prectice ();
  Prectice.num(12,43);
 }
 public static  int num(int a,int b)
 {
  int num=a+b;
  System.out.println(num);
  return num;
 }
 }
 */

public class Prectice  
{
	public static void main (String args[])
	{
		
		//for (int i= 5; i>=0;i--)
		//	System.out.println(i);
	
	int n=5;
	
	     for(int i= 0; i<n; i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 if(i==0||j==0||i==n-1||j==n-1)
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
				 
			 }
			 System.out.println();
		 }
		 //System.out.println();
	}
}	