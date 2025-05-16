public class AmazonDiscount 
{
    public static void main (String [] args )
 {
   double orderAmount = 85000.0 ;
  
  if (orderAmount >= 10000)
   {
   System.out.println("Diccount Applide : 20 %");
   }
 
   else if ( orderAmount >= 5000)
     {
      System.out.println("Diccount Applide : 15 %");
	 }
	 
   else if ( orderAmount >= 2000)
     {
      System.out.println("Diccount Applide : 10 %");
	 }
	 
   else 
    { 
     System.out.println(" NOT Diccount Applied  ");	 
    }
  
 }

} 