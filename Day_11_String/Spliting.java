class Spliting
{
public static  void main (String args[])
{
  String str = "Kodewala,Academy,BTM,Bangalore";
  String [] languages = str.split(",");
  
  for (String lang :languages)
  {
  System.out.println(lang);
  }
  
  
  
  String a= "Ashish,Kumar,Thakur,BTM,Bangalore";
  String [] lng = a.split(",");
  for(String b:lng)
  {
	  System.out.println(b);
  }
}
}