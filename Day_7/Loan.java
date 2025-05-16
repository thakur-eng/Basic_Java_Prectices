class Loan
{
public static void main (String args [] )
{ 
   Loan lp = new Loan ();
   lp.loanpass(500000 ,  2000 );
}
 public int loanpass (int salary, int cvil )
 {
  if ( salary >= 30000 && salary >= 50000 && cvil >= 750)
  {
    int interest =  5 ; 
	System.out.println( " congrates you are eligible for loan with intrest rate is " + interest +"%");
  }
  else if (  salary==40000 && cvil == 700 || salary == 30000 && cvil == 650 )
  {
  
  if (salary==40000 && cvil == 700)
    {
     int interest = 8; 
  	System.out.println( " congrates you are eligible for loan with intrest rate is " + interest+"%");
	}
  if (salary == 30000 && cvil == 650 )	
   { 
    int interest = 12; 
	System.out.println( " congrates you are eligible for loan with intrest rate is " + interest+"%");
   }
  }
else 
  {
   	System.out.println( " sorry sir you are not eligible for loan bater luck next time" );
  }
  return 0;
 }
}

