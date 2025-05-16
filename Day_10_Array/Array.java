
import java.util.Scanner ;

public class Array
{
 public static void main (String args [])
 {
   String arr[]= new String [3];
   arr[0]="Ashish";
   arr[1]="Kumar";
   arr[2]="Thakur";
   
   
   
   
   for (int index = 0; index<arr.length; index++)
    {
		String s1= arr[index];
	 	if(arr[index]==("Thakur"))
		{
				 System.out.println( s1 );

		}
		else 
		{
		System.out.println("not heare");
		}
	}
   
 }
}