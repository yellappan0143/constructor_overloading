package com.jsp.constructorspkg;

public class Employee 
{
	int E_Id;
	String E_Name;
	int Age;
	String Dob;
	String Email;
	char Gender;
	int Exp;
	String Role;
	
	public Employee(int E_Id,String E_Name,int Age,String Dob,String Email,char Gender,int Exp,String Role) 
	{
		this.E_Id=E_Id;
		this.E_Name=E_Name;
		this.Age=Age;
		this.Dob=Dob;
		this.Email=Email;
		this.Gender=Gender;
		this.Exp=Exp;
		this.Role=Role;
	}
	public Employee(int E_Id,String E_Name,int Age,String Dob,String Email,char Gender,String Role) 
	{
		this.E_Id=E_Id;
		this.E_Name=E_Name;
		this.Age=Age;
		this.Dob=Dob;
		this.Email=Email;
		this.Gender=Gender;
		this.Role=Role;
	}
	public void display() 
	{
		System.out.println("Employee Id : "+E_Id);
		System.out.println("Employee Name : "+E_Name);
		System.out.println("Age : "+Age);
		System.out.println("Date Of Birth : "+Dob);
		System.out.println("Email Id : "+Email);
		System.out.println("Gender : "+Gender);
		System.out.println("Exprence : "+Exp+"-years");
		System.out.println("Employee Role : "+Role);
	}

	public static void main(String[] args) 
	{
		Employee e = new Employee(1, "Madesh", 22, "24-12-2000", "madesh@gmail.com", 'M', 2, "Software Developer");
		         e.display();
		         System.out.println("-------------------------");
		Employee e1 = new Employee(2, "Lance", 22, "02-01-2000", "lance@gmail.com", 'M', "Software Testing");
		         e1.display();
	}

}
