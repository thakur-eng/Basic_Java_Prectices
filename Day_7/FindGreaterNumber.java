public class FindGreaterNumber 
{
    public static void main ( String args [])
     {
	  FindGreaterNumber fgn = new FindGreaterNumber();
	  String value = fgn.greaterNumber(5);
	 System.out.println(value);
     }
	 public String greaterNumber ( int num ) 
	 {
		 String s1 = "bhag jaa";
	  if ( num <=10)
	  {
	    
	   System.out.println( " This number is greater then 0 to  " +num);
	  }
      
      else 
      {
        	System.out.println( " This number is not greater then 0 to " +num);  
       }
	   return s1;
	}
}	