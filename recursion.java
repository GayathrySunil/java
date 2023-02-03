import java.io.*;
import java.lang.*;
class Factorial
{
 public int r=1;
public int factor(int n)
{
 if(n!=1)
 {
 r=n*factor(n-1);
 }
return r;
}
}
class recursion
{
public static void main(String args[])
{
try
{
int n,r=1;
DataInputStream dir =new DataInputStream(System.in);
System.out.println("enter the limit");
n=Integer.parseInt(dir.readLine());
Fac obj=new Fac();
r=obj.factor(n);
System.out.println("Factorial is: "+r);
}
catch(Exception e)
{
System.out.println("error"+e);
}
}
}
