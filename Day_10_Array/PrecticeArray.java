public class PrecticeArray
{
 public static void main(String args[])
 {
  /*
  int[] a= new int [3];
  a[0]= 10;
  a[1]=20;
  a[2]=30;
  for ( int index =0; index<a.length ; index++)
  {
	  //int n= a[index];
	  System.out.println(a[index]); //  using loop to call 
	  
  }
  System.out.println(a[1]); // direct call 
  */
  
  int [] a={10,20,12,90,40,24,80};
  
  for(int index =0; index<a.length; index++)
  {
	  if(a[index]==(80))
		  
	  {
	  System.out.println(" yes got it  " +a[index]);
	  }
	  else
	  {
		  System.out.println("This is not availabe in list");
		  
	  }
  }
  
  
  }
 } 