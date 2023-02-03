import java.io.*;
import java.lang.*;
class Progrm
{
 public int temp(int n)
 {
 if(n!=0)
 {
 System.out.println(n);
 n=temp(n-1);
 }
 return 1;
 }
 public int temp1(int i,int n)
 {
 if(i<=n)
 {
 System.out.println(i);
 i=temp1(i+1,n);
 }
 return 1;
 }
}
class Recur
{
 public static void main(String args[])
 {
 try
 {
 int n,n1;
 DataInputStream dir=new DataInputStream(System.in);
 System.out.println("enter the limit");
 n=Integer.parseInt(dir.readLine());
 Prgm obj=new Prgm();
 Prgm obj1=new Prgm();
 System.out.println("reverse order: ");
 n1=obj.temp(n);
 System.out.println("orginal order: ");
 n1=obj1.temp1(1,n);
 }
 catch(Exception e)
 {
 System.out.println("error"+e);
 }}}


