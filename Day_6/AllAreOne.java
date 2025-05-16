 class AllAre 
{
  public static void main (String args [])
  {
    AllAre aa = new AllAre();
	/*aa.add(30,10);
	aa.sub(30,10);
	aa.multi(30,10);
    aa.devide(30,10);*/
	int k = aa.sum1(aa);

  }
  public int sum1 (AllAre are)
  {
	  int result = are.add(10,23);
	  int result1 = are.sub(23,10);
	  int result2 = are.multi(10,10);
	  int result3 = are.devide(50,5);
	  System.out.println(result);
	  System.out.println(result1);
	  System.out.println(result2);
	  System.out.println(result3);
	

	  return 0;
  }
 
  
  public int add  (int a , int b )
    {
    int add = a+b;
	//System.out.println ( add );
	return add  ;
	}
	public int sub ( int a, int b)
	{
	int sub = a-b;
	//System.out.println(sub );
	return sub ;
	}
	public int multi ( int a , int b)
	{
	int multi = a*b;
	//System.out.println(multi);
	return multi ;
	}
	public int devide ( int a, int b) 
	{
	int devide = a/b;
	//System.out.println(devide );
	return devide;
	}
	
	}