class OverLoad
{
	public static void main(int [] args)
	{
		
		System.out.println("tejas");
	}
	
	public static void main(String [] args)
	{ 
		OverLoad ov = new OverLoad();
		int [] a = {2,3,4,5};
		ov.main(a);
		
		System.out.println("kishan jha");
	}
}