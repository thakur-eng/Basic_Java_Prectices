class MobileLone 
{
public static void main ( String args [])
{
 MobileLone ml = new MobileLone();
  ml.lone ( 1000, "iphone");
  }
public void lone ( int pricerange , String name )

{
 if(pricerange == 100000 && name== "iphone" )
   { 
   System.out.println ( " congrats you are eligible for purchage Iphone with  low intrest rate is 12%");
   }
  
else if (pricerange == 70000 && name== "oneplus" )
  {
  System.out.println ( " congrats you are eligible for purchage Iphone with  low intrest rate is 10%");
  }
else if (pricerange == 40000 && name== "sumsung")
  {
  System.out.println ( " congrats you are eligible for purchage Iphone with  low intrest rate is 10%");
  }
  
  
 else if (pricerange == 30000 && name== "realme")
  {
  System.out.println ( " congrats you are eligible for purchage Iphone with  low intrest rate is 8%");
  }
 
  
 else if (pricerange >= 30000 && name== "")
  {
  System.out.println ( " congrats you are eligible for purchage Iphone with  low intrest rate is 8%");
  }
  
else 
 {
  System.out.println("sorry you are not eligible");
 }
  
  
 }
}