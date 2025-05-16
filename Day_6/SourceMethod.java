class SourceMethod 

{
 public static void main ( String args [])
 {
 
    SourceMethod sm = new SourceMethod();
	 int k = sm.sum(sm);
  }
 
 public int sum (SourceMethod  wala )
 {
   int sum = wala.Methodsum(10,20);
   int sub = wala.Methodsub(10,20);
   int multi = wala.Methodmulti(10,20);
  String say = wala.Methodsay();
   
   System.out.println( sum );
   System.out.println(sub);
   System.out.println(multi);
   System.out.println (say);
   
   return 0;
   
   }
   
public int Methodsum( int a ,int b )
{  
  int sum = a+b;
   return sum ;
 }

 public int Methodsub ( int a,int b)
 {
   int sub = a-b;
   return sub ;
   }
   
 public int  Methodmulti (int a, int b )
 {
   int multi =  a*b ;
   return multi ;
   }
   
 public String Methodsay ()
  {
     //String say  = " say hello " ;
	 return " say hello " ; 
	 }
	 
	 }
	 