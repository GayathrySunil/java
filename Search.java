import java.io.*;
class Search
{
	public static void main(String args[])
	{
		String s;
		int n,i,a[],x;
		Boolean f=false;
		
		DataInputStream din=new DataInputStream(System.in);
		try
		{
			System.out.println("Enter the size of array :");
			s=din.readLine();
			n=Integer.parseInt(s);
			a=new int[n];
			
			System.out.println("Enter the elements :");
			for(i=0;i<n;i++)
			{
				s=din.readLine();
				a[i]=Integer.parseInt(s);
			}
			System.out.println("Array elements are :");
			for(i=0;i<n;i++)
			{
				System.out.print(a[i]+"\t");
			}
			
			System.out.println("\nEnter the element to be found ");
			s=din.readLine();
			x=Integer.parseInt(s);
			
			for(i=0;i<n;i++)
			{
				if(a[i]==x)
				{
					f=true;
				}
			}
			if(f==true)
			{
				System.out.println("Element "+x+" found at position "+i);
			}
			else
			{
				System.out.println("Element "+x+" not found");
			}	
		}
		catch(IOException e)
		{
			System.out.println(e);}}}
			
