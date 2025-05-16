class AllAre 
{
  public static void main (String args [])
  {
    AllAre aa = new AllAre();
	aa.add(30,10);
	aa.sub(30,10);
	aa.multi(30,10);
    aa.devide(30,10);

  }
  
  public int add  (int a , int b )
    {
    int add = a+b;
	System.out.println ( add );
	return add  ;
	}
	public int sub ( int a, int b)
	{
	int sub = a-b;
	System.out.println(sub );
	return sub ;
	}
	public int multi ( int a , int b)
	{
	int multi = a*b;
	System.out.println(multi);
	return multi ;
	}
	public int devide ( int a, int b) 
	{
	int devide = a/b;
	System.out.println(devide );
	return devide;
	}
	
	}