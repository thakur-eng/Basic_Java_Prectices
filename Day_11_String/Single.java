class Single
{
	public static void main(String [] args)
		{
		int [] arr =  {16,18};
		System.out.println(sumOfArray(arr));


		}
	public static int sumOfArray(int [] arr)
	{
	int total =0;
	 for(int i =0;i< arr.length;i++)
	 {
	  total+=arr[i];
	 }
	 
	 while(total>=10){
		 int sum =0;
	 while(total>0)
	 {
	sum +=  total %10;
	 total/=10;
	 }
	  total=sum;
	 }
	 return total;
	}
}