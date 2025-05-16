public class StudentName 
{
 public static void main (String args [])
 {
  String[] arr = new String[10];
  
  arr[0]="ashish";
  arr[1]="Kode";
  arr[2]="wala";
  arr[3]="academy";
  arr[4]="btm";
  arr[5]="layout";
  arr[6]="puna";
  arr[7]="ram";
  arr[8]="mohan";
  arr[9]="pravin";
  
  String a= "Lumar";
  
   
  
  for (int index =0; index<arr.length; index++)
    {
	 String s= arr[index];
	 System.out.println(s);
	 
	 if (s==a)
		 System.out.print(a);
	 } 
  }
}  