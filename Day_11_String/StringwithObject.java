class StringwithObject
{
  public static void main (String args[])
  {
     String s1="KodeWala";
     String s2=new String("KodeWala");
	 
	 String s3="Ashish";
     String s4=new String("Ashish");
	 
	 String s5="Thakur";
     String s6=new String("Thakur");
	 
	 System.out.println(s1==s2);//
	 System.out.println(s3==s4);//
	 System.out.println(s5==s6);//
	 
	 System.out.println(s1.equals (s2));//
	 System.out.println(s3.equals (s4));//
	 System.out.println(s5.equals (s6));//

  }
}