 class Amazon 
 
 {
    public static void main(String args[])

	{
        Amazon az = new Amazon();
		
		int amount = 30000;
		
        az.first(5000);
        az.second();
        az.three();
        az.fourth();
		
     if(amount > 1000)
 {	
                System.out.println("You are not eligible for a discount.");
 }
	 
	 else if (amount == 1000)
	 {
		 int dis = amount * 5 / 100;

	 System.out.println("You are  eligible for a discount.");
	 }
 
   else 
		{
            System.out.println("You are not eligible for a discount.");
        }
   
    }


    public void first(int amount ) {
        
        if (amount == 1000) {
            int dis = amount * 5 / 100;
            System.out.println("You are eligible for a discount of = " + dis);
        } 
		
		else
		{
            System.out.println("You are not eligible for a discount.");
        }
    }

    public void second() {
        int amount = 2000;
        if (amount == 2000) {
            int dis = amount * 10 / 100;
            System.out.println("You are eligible for a discount of = " + dis);
        }
		else
		{
            System.out.println("You are not eligible for a discount.");
        }
    }

    public void three() {
        int amount = 5000;
        if (amount == 5000) {
            int dis = amount * 15 / 100;
            System.out.println("You are eligible for a discount of = " + dis);
        }
		else 
		{
            System.out.println("You are not eligible for a discount.");
        }
    }

    public void fourth() {
        int amount = 10000;
        if (amount == 10000) {
            int dis = amount * 20 / 100;
            System.out.println("You are eligible for a discount of = " + dis);
        } 
		else 
		{
            System.out.println("You are not eligible for a discount.");
        }
    }
}
