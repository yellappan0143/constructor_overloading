package com.jsp.c.overloading;
/* EMPLOYEE'S REQUIREMENT BY USING CONSTRUCTOR OVERLOADING METHODS :-
 * #ID+NAME #AGE #SALARY #GENDER #EMAILID #EXPERENCE #MOBILE.NO #10TH-MARKS #12TH-MARKS #UG-PERCENTAGE #PG-PERCENTAGE
 * 
 * */
public class C_OverLoading 
{
	// CONSTRUCTOR OVER LOADING 
	public C_OverLoading() 
	{
		System.out.println("EMPLOYEE DETAILS :-");
		System.out.println("********************");
	}
	public C_OverLoading(String Name) 
	{
		this(01);
		System.out.println("EMP_NAME  : "+Name);	
	}
	public C_OverLoading(int Id) 
	{
		this();
		System.out.println("EMP_ID\t  : "+Id);	
	}
	public C_OverLoading(char A) 
	{
		this(22,50000.0d);
		System.out.println("MARRIED STATUS : "+A);
	}
	public C_OverLoading(int Age,double Salary) 
	{
		this("Madesh");
		System.out.println("AGE\t  : "+Age+" \nSALARY    : "+Salary);
	}
	public C_OverLoading(String Email,int Exp) 
	{
		this('T');
		System.out.println("EMAIL ID   : "+Email+" \nEXPERENCE  : "+Exp+"-Years");
	}
	public C_OverLoading(long phone) 
	{
		System.out.println("EMPLOYEE PHONE NO "+phone);
	}
	public C_OverLoading(double sslc,double hrsc,double Ug) 
	{
		this("madesh@gmail.com",4); // THIS LINE IS CALLING LINE.NO 38	
	    System.out.println("10TH MARKS : "+sslc+"%"+"\n12TH MARKS : "+hrsc+"%"+"\nUG PERCENTAGE : "+Ug+"%");
	}
	public C_OverLoading(double Pg ) 
	{
		
		this(85.0d,83.7d,89.2d); // THIS LINE IS CALLING LINE.NO 38	
		System.out.println("PG PERCENTAGE : "+Pg+"%");
	}
	
	public static void main(String[] args) 
	{
		new C_OverLoading(95.5d);
		
	}

}
