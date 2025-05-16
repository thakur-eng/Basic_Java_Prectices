class M2
{
	public static void main(String [] args)
	{
		if(true)
		{
				System.out.println("Hello ji parent if ");

				if(false)
				{
				System.out.println("Hello ji if child");
				}
				else if(false)
				{
				System.out.println("Hello ji else if child");
				}
				else 
				{
						if(false)
						{
						System.out.println("Hello ji if sub child");
						}
						else if(false)
						{
						System.out.println("Hello ji else if sub child");
				}

				}
		}
		else
		{
				System.out.println("Hello ji parent else ");

		}
	}
}

// thakur = 7 11 15
//teja = 7 11
