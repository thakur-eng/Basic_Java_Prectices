import java.util.*;

class ProvideByUser

{
public static void main (String args[])
{

  int[] array= new int[3];
  
  array[0]=2;
  array[1]=4;
  array[2]=6;
   
   Scanner sc=new Scanner(System.in);
   String  i=sc.next ();
  
  for(int index = 0 ; index<array.length ; index++)
  {
    System.out.println(array[index]);
  }
}
}