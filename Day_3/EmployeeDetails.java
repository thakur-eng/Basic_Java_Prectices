 class EmployeeDetails
 {
    public static void main(String[] args)

	{
        // Primitive Data Types Exploration
        byte age = 30;                     // Age of the employee
        short yearOfJoining = 2015;        // Year when employee joined
        int employeeId = 12345;            // Employee ID
        long phoneNumber = 9876543210L;    // Phone number
        float monthlySalary = 75000.50f;   // Monthly salary
        double annualSalary = monthlySalary * 12; // Annual salary
        char grade = 'A';                  // Employee performance grade
        boolean isSalaryVisible = true;    // Boolean flag to control salary display

        // Displaying the primitive data type values
        System.out.println("--- Employee Details ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Age: " + age);
        System.out.println("Year of Joining: " + yearOfJoining);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Grade: " + grade);

        // Display salary details if permitted
       // if (isSalaryVisible) 
		//{
            System.out.println("Monthly Salary: " + monthlySalary);
            System.out.println("Annual Salary: " + annualSalary);
        //} 
		
		//else
		//	{
            System.out.println("Salary details are hidden.");
       // }
    }
}
