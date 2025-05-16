import java.util.Scanner;

public class DoWhileLoop
{
 public static void main (String args [])
 {
   int actualpin =1234;
   int enterPin = 0;


	Scanner sc = new Scanner(System.in);

   do
   { 
    
           System.out.println("Please enter  the PIN: ");
            enterPin = sc.nextInt();  
	if (enterPin !=actualpin)
	 {
	  System.out.println("please enter the  0correct pin");
	  }
	  else 
	  {
	   System.out.println("correct pin entered");
	   }
	}

while(actualpin  != enterPin );

 sc.close(); 
}
}