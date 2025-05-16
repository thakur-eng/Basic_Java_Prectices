public class NonPrimitiveDataType_2
{

public static  int Emplynum=234;
public static void main (String[] agrs )

{

 String name = "Kodewala";
 System.out.println("name of the Employe="+name);
 Account account = new Account (); 
 account.doFundTransfer();
}
}


  class Account 
  {
  public  void doFundTransfer ()
  {
   System.out.println("this is the emplye number="+NonPrimitiveDataType_2.Emplynum);
  }
}
  