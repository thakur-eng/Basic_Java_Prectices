public class ArrayChar
{
 public static void main(String args[])
 {
   char [] ch = new char[5];
   ch[0]='a';
   ch[1]='b';
   ch[2]='c';
   ch[3]='d';
   ch[4]='e';
   
   for (int index =0; index<ch.length; index++)
    {
	  char c = ch[index];
	  
	  System.out.println(c);
	  }
}
}	  