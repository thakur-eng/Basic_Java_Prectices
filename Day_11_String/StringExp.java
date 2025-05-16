public class StringExp
{
 public static void main (String args[])
 {
  StringBuilder logMsg = new StringBuilder();
  
  logMsg.append("StringExp : ");
  
  logMsg.append("Main()");
  
  System.out.println(logMsg + "ENITER"); // logging fremwork - Log 4
  
  String s1 = "Kodewala";
  
  System.out.println("This  is String .......");
  
  StringBuilder sb = new StringBuilder("Kodewala");
  
  sb.append("Academy");
  
  System.out.println("Exit - Main Menthod ");
 }
}