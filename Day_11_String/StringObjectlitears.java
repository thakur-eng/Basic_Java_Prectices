public class StringObjectlitears

{
	 public static void main (String args[])
	 {
	  String s1="KodeWala";
	  
	  String s2="KodeWala";
	  
	  String s3=new String("KodeWala");
	  
	  String s3 = s3.intern();
	  
	  /* String s4=new String("Academy");
	  
	  String s7= s4.intern();
	  
	  String s5="Academy";
	  
	  System.out.println(s1==s2);
	  System.out.println(s1.equals(s2));
	  
	  System.out.println(s2==s3);
	  System.out.println(s2.equals(s3)); */
	  
	  System.out.println(s2==s3);  
	  System.out.println(s2.equals(s3));
	  
	 }
}