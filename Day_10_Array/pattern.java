/*

1234
4321
1234
4321
*/
class pattern
{
public static void main(String [] args)
{
	double arry[]={12,23,45,35,67,89,54,29};
	
	for(int i= 0;i<arry.length;i++)
	{
		if(arry[i] <=60)
			System.out.println("pass with 1st div");
		else if (arry[i] >=40 && arry[i] <=60)
		System.out.println("pass with 2nd div");
	    else if (arry[i]==30)
		System.out.println(" just pass ");
	else 
	{ 
      System.out.println(" you are failed ");
	}
	}


	}
}