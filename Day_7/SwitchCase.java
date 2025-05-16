public class SwitchCase 
{
 public static void main ( String args [])
 {
  String dis = "Elite";
  
  switch (dis)
  {
   case"Economy":
     System.out.println("Economy is not eligible for discount");
   break;
   
   case"Biz":
      System.out.println("Biz is  eligible for discount 5 %");
	  break;
	  
   case"Elite":
       System.out.println("Elite is  eligible for discount 10 %");
       break;
	   
	   default:
	   System.out.println( "not eligible ");
	 } 
 }	 

public void sayHello()
{
  System.out.println("Economy is not eligible for discount");
}

}