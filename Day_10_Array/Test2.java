import java.util.*;
class Test2
{
public static void main(String [] args)
{
String [] s1 = new String[6];
s1[0]="iphone";
s1[1]="lava";
s1[2]="nokia";
s1[3]="sumsung";
s1[4]="lg";
s1[5]="readme";
Scanner sc = new Scanner(System.in);
String s =  sc.next();
for(int i = 0 ; i <s1.length;i++)
{
if(s1[i].equals(s))
{
System.out.println(s1[i]);
}
}
}
}