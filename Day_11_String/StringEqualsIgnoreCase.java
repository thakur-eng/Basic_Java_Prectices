class StringEqualsIgnoreCase
{
public static void main (String args[])
{
 String s1="Ashish";
 String s2="ASHISH";
 
 System.out.println(s1.equalsIgnoreCase(s2));
 
 String s3="Ashish Kumar ";
 String s4="Ashishkumar";
 
 System.out.println(s3.equalsIgnoreCase(s4));
 
 String s5="Ashish";
 String s6="AShish";
 
 System.out.println(s5.equalsIgnoreCase(s6));
 
}
}