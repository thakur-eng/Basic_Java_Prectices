import java.util.*;
class sort
{
public static void main(String [] args)
{
int [] arr = {2,1,4,5,7,8,3,6}; // output=12345678
for(int i = 0;i<arr.length-1;i++)
{
for(int j = i+1;j<arr.length;j++)
{
if(arr[i]>arr[j])
{
int temp= arr[i];
arr[i] = arr[j];
arr[j]=  temp;
}

}
}
System.out.println(Arrays.toString(arr));
}
}