import java.io.*;
class test
{
	public int funeve()
	{
		DataInputStream din=new DataInputStream(System.in);
			String s;
			int n,sum=0,i,e=0;
			try
			{
				System.out.println("ENTER THE LIMIT NUMBER: ");
				s=din.readLine();
				n=Integer.parseInt(s);
				
				for(i=0; i<n; i++)
				{
					e=e+2;
                    sum=sum+e;
				}
			}
			catch(IOException e1)
			{
				System.out.println("ERROR" +e1);
			}
			return sum;}}
class evensum
{
	public static void main(String args[])
	{
		int r;
		test t=new test();
		r=t.funeve();
		System.out.println("SUM OF THE EVEN NUMBERS: "+r);}}


