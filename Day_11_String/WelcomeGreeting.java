//WAP with string welcome griting user input

import java.util.Scanner; 

public class WelcomeGreeting
 {
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in); 
        
        System.out.print("Enter your name: "); 
        String name = scanner.nextLine(); 
        
        System.out.println("Welcome, " + name + "!"); 
        
        scanner.close(); 
    }
}
