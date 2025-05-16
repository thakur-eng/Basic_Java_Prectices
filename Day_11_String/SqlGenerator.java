public class SqlGenerator
{
 public static void main (String args [])
 {
  SqlGenerator sqlGenerator = new SqlGenerator();
  
    StringBuilder sb = sqlGenerator.generateSQL(true, false);
     
  
  System.out.println("Query is :::"+ sb);
  
 }
 private StringBuilder generateSQL(boolean withSalary, boolean withEmployeeId)
 {
	 StringBuilder sb = new StringBuilder("Select*from employee");
	 
	 if(withEmployeeId)
	 {
		 sb.append("where employee id = 10001");
		 
	 }
	 if(withSalary)
	 {
		 sb.append("where Salary >1000");
		 
	 }
	 sb.append(";");
	 return sb;
 }
}