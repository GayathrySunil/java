import java.io.*;
class test
{
	public int sm(int n)
	{
		int s=0, rem;
		while(n>0)
		{
			rem=n%10;
			s=s+rem;
			n=n/10;
		}
		return s;
	}}
class sumdigits
{
	public static void main(String args[])
	{
		DataInputStream din= new DataInputStream(System.in);
			String s;
			int n, r;
			try
			{
				System.out.println("ENTER THE NUMBER: ");
				s=din.readLine();
				n=Integer.parseInt(s);
				test t= new test();
				r= t.sm(n);
				System.out.println("SUM OF DIGITS OF THE NUMBER: "+r);
			}
			catch(IOException e)
			{
				System.out.println("ERROR"+e);
			}}}
