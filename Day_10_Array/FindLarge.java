public class FindLarge
{
 public static void main (String args[])
 {
   int[] number ={10,20,30,40,50,60,70,80,90,100};
   int max= 0;
   
   for(int i= 0;i<number.length;i++)
   {
    if(number[i]>max)
	{
	  max=number[i];
	}
   }
   System.out.println("Max is "+max);
 }
}