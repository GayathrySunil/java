import java.io.*;
import java.lang.*;
class staticeven
{
 static int n;
 public static void main(String args[])
 {
  DataInputStream d=new DataInputStream(System.in);
  try{
  System.out.println("Enter the number:");
  n=Integer.parseInt(d.readLine());
  Evennum.even(n);
     }catch(IOException e)
  {System.out.println(e);}
 }
}
 class Evennum
{
 static void even(int n)
 {
	 for(int i=0;i<=n;i++)
	 {
		if(i%2==0)
	 System.out.println("even number:" +i);
	 }
 }
}
    

  