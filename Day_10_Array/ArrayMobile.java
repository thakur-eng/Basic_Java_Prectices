public class ArrayMobile
{
 public static void main (String args [])
 {
  String arry []= new String[12];
  arry[0]="Nokia";
  arry[1]="iphone";
  arry[2]="lava";
  arry[3]="sumsung";
  arry[4]="mi";
  arry[5]="microman";
  arry[6]="xiome";
  arry[7]="google";
  arry[8]="oneplus";
  arry[9]="lg";
  arry[10]="carban";
  arry[11]="vivo";
  
  for ( int index =0 ; index<arry.length; index++)
   
  {
     String s= arry[index];
	 
	 if(arry[index].equals("Ram"))
	 {
	   System.out.println("this is heare :" +s);
	 }
	 else {System.out.println("this is  not available heare :");}
	   
	}    
 }
}
