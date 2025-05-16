class ForeEchArray
{
 public static void main (String args[])
 {
  
   String[] product ={"lava","nokia","java","sumsung" ," mi"};
   
   int [] price = {1000,2999,92901,983,90890};
   int index=0;
    for(String str :product)
	{
	     System.out.println( str+" "+ price[index] );
		 index++;
	    }
	for(int i:price)
	{
	  System.out.println(i);
	}
 }
} 