import java.io.*;
class disploop
{
	public static void main(String args[])
	{
		int m,n,i;
		DataInputStream br =new DataInputStream(System.in);
		try{
		System.out.println("enter m:");	
		m=Integer.parseInt(br.readLine());
		System.out.println("enter n:");
		n=Integer.parseInt(br.readLine());
		System.out.println("elements are:");
		i=m;
		while(i<=n){
			System.out.println(i);
			i++;
			}
		}catch(Exception e){}
	}
}