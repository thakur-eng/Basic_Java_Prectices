import java.util.Scanner;

public class HW
{ 

public static void main( String args[])
{
 int userInput =0;
 int expectedNumber =10;
 
 Scanner sc= new Scanner(System.in);
 
 while ( userInput != expectedNumber)
 { 
   userInput = sc.nextInt();
   if(userInput == expectedNumber)
   {
     System.out.println("congratulation ! you guessed the correct number .");
	 
   }
   else 
   {
      System.out.println("Sorry this is not correct number. try agin ");
   }
 }
  sc.close();
}
}