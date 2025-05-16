class MyClass 
{

    static int value = 10; // Static variable
    int value = 20;        // Instance variable
    
	int Instance = 20;
	
    public static void main(String[] args) 
		
		{
		
		MyClass obj = new MyClass();
        //obj.value();

        //System.out.println("Instance variable: " + obj.Instance); // Refers to instance variable
        System.out.println("Static variable: " + MyClass.value); // Refers to static variable
    }
}
