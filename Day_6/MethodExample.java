 public class MethodExample 
 
 {
   public static void main (String args [])
   {
   
   System.out.println (" Start Method Example ");
   
     MethodExample me = new MethodExample();
	 
	 me.excute(me);
	 
	 System.out.println( " End Method Example");
   }
 
 public void excute(MethodExample me )
  
   {
     int value = me.addTwoNumber(10,15);
    System.out.println(" Sum is " + value);	 
	
	 int value1 = me.subTwoNumber (15,3);
	 System.out.println( " Sub is " + value1);
	 
	 String s1 = me.sayHello();
	 System.out.println("Say hello" + s1);
   }
   
 public int addTwoNumber(int a,int b)
  {
     int add = a  + b ; 
	 return add;
  }
 public int subTwoNumber( int a,int b)
    {
	int  sub = a-b ;
	return sub;
	}
	
	public String sayHello()
	{
	return "Hello";
	}
	
	
}	 