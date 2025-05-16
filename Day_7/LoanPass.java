public class LoanPass
{
public static void main (String args [])
{

LoanPass loan = new LoanPass();
loan.checkIntrest(100000,700);
 }
 
 public int checkIntrest ( int mony , int civel )
 {
	int intrest=0;
	if ( mony >100000 && civel >750 )
	{
		    intrest = mony*3/100;
		   System.out.println ( "you are qulify for loan with intrest" + intrest);
	}
	return intrest;
   }
   
}