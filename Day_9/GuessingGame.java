//import java.util.scanner;
import java.util.Scanner;

public class GuessingGame
{
 public static void main (String args[])
 {
   int userGuess =0;
   int expectedNumber=5;
   
   Scanner sc = new Scanner(System.in);
   
   while (userGuess != expectedNumber)
   {
     userGuess = sc.nextInt();
	 if(userGuess == expectedNumber)
	 {
	  System.out.println("congratulation ! you guessed the correct number .");
	  }
	  else 
	  {
	  	  System.out.println("Bed luck try again .");
	  }
   }
   sc.close();
   }
  } 
	 