public class TwoDexample
{
 public static void main (String args[])
{
 String str[][]= {{"ram","mohan","shyam","ghanshyam"},{"madan","rahul","raj","ramesh","Suresh","prashant" }};

for(int i= 0; i<str.length; i++)
 {
  for(int j=0; j<str[i].length; j++)
  {
    System.out.print(str[i][j] +" ");
  }
 }
 System.out.println(" "); 
}
} 