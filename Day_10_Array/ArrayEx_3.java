public class ArrayEx_3
{
  public static void main (String[]args)
  {
   int number[];
   number= new int[5];
   
   number[0] =13;
   number[1] =4;
   number[2] =43;
   number[3] =53;
   for(int i=0; i<number.length; i++)
   {
      System.out.println("number["+i+"]="+number[i]);
   }
  }
  
}