class MathodSum 
{

  static String name = " Ashish ";
  static int age = 24;
  static int wait = 78;
  
 public static void main ( String args [])
 {
   // System.out.println("Name =" + name "|| Age = " + age "|| Wait =" + wait );
   
     System.out.println("Name =" + name );
     System.out.println("Age =" + age );
     System.out.println("Wait =" + wait );

   
     MathodSum ms = new MathodSum();

     MathodSum.ramu();

     System.out.println ( ms.samu(45,65) );	 
	 
 }
 
 public static void ramu ()
   {
   System.out.println( " My name is ramu and i am from KA and wellcome to you in kodewala "); 
   }
   
   public int  samu ( int a, int b )
   {
     int sum= a+b;
	 return sum;
   }
}
 
