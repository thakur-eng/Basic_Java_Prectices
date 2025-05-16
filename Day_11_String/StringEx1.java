class StringEx1
{
  public static void main (String args[])
  {
    String a1="Ram";
	String a2=a1.concat("Chandra");
	System.out.println( a2);
	System.out.println(a1==a2);
	
	String b1="Ashish";
	String b2="ashish";
	System.out.println(b1==b2);
	
	String f1="Ashish";
	String f2="Ashish";
	System.out.println(f1==f2);
	
	String c1="Prashnt";
	String c2=c1.concat("Ashish");
	System.out.println(c2);
	System.out.println(c1==c2);
	
	String e1="Kode Wala ";
	String e2="Academy";
	System.out.println(e1==e2);
	
	String d1="Ashish ";
	String d2=d1.concat("Kumar ");
	String d3=d2.concat("Thakur");
	System.out.println(d3);
	System.out.println(d2==d3);
	
	String q1="Ashish ";
	String q2=q1.concat("Kumar ");
	String q3=q1.concat("Thakur ");
	System.out.println(q2);
	
	
	
	
	
  }
}