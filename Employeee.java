/*Create a class for Employee having eno,ename and esal as data members.
Provide functions for reading and displaying employee details.
(Accept information of n employees in the main function, display the same and search for an emp(using eno)).*/

import java.io.*;
import java.lang.*;
import java.util.Scanner;
class Prgm
{
	public String name;
	public int number,sal;
	public void read()
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			DataInputStream dir=new DataInputStream(System.in);
			System.out.println("Enter the employee name:");
			name=sc.nextLine();
			System.out.println("Enter the employee number:");
			number=Integer.parseInt(dir.readLine());
			System.out.println("Enter the employee salary:");
			sal=Integer.parseInt(dir.readLine());
		}catch(Exception e)
			{
				System.out.println("error"+e);
			}
	}
public void display()
{
	System.out.println("Employee id:"+number);
	System.out.println("Employee Name:"+name);
	System.out.println("Employee Salay:"+sal);
}
}

class Employeee{
	public static void main(String args[])
	{
		try{
		int i,n;
		DataInputStream dir=new DataInputStream(System.in);
		System.out.println("Enter the number of employee:");
		n=Integer.parseInt(dir.readLine());
		Prgm obj[]=new Prgm[n];
		for(i=0;i<n;i++)
		{
			obj[i]=new Prgm();
			obj[i].read();
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Details of Employee "+(i+1));
			obj[i].display();
		}
		}catch(Exception e)
		{
			System.out.println(e);
			
		}
	}
}

	
	