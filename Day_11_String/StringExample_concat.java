
class StringExample_concat
{
 public static void main (String args[])
 {
      
  String s1="Kodewala"; //1 object//scp string constant pool
  String s2="Kodewala"; 
  String s3="Kodewala";
  String s4="Kodewala";
  String s5="Kodewala";
  
  String s6 = s1.concat("Academy"); //2nd
  
  System.out.println(s1==s2);//tru
  System.out.println(s2==s3);//tru
  System.out.println(s3==s4);//tru
  System.out.println(s4==s5);//tru
  System.out.println(s5==s6);//false
  
  
  
  
  }
}

