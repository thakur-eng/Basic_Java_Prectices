class Chana 
{
public static void main ( String args []) 
 {
 Chana me = new Chana();
  me.sum(me);
 }
  
 public int  sum ( Chana me)
 {
  int value = me.addTwoNumber (10,20);
  System .out.println ( value );

  int value1 = me.subTwoNumber (90,20);
    System .out.println ( value1 );
	return 0;
 }

public int addTwoNumber( int a, int b ) 
  { 
  int sum = a+b;
  return sum ;
  }
  
  public int subTwoNumber( int a, int b ) 
  { 
  int sub = a-b;
  return sub ;
  }
  
  }
  