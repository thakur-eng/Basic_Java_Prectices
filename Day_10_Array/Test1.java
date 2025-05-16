import java.util.*;
class Test1
{
public static void main(String [] args)
{
String [] s1 = {"iphone","lava","nokia","sumsung","lg","readme"};
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