public class PositivenumberCheck 
{
 public static void main (String args [])
 {
  int number = -10;
  checkIfpositive(number);
 }
 
 private static void checkIfpositive (int number)
 {
  if (number>0)
  { 
  System.out.println("This number is positive.");
  }
  else 
  {
	  System.out.println("This number is not  positive.");
  }
 }
} 
  