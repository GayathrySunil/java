import java.io.*;
import java.lang.*;
class Func
{
 public int max(int t1,int t2)
 {
 if(t1>t2)
 {
 return t1;
 }else
 {
 return t2;
 }
 }
 public void max2(int t1,int t2,int t3)
 {
 int temp=max(t1,t2);
 if(temp>t3)
 {
 System.out.println("max element is:"+temp);
 }else
 {
 System.out.println("max element is:"+t3);
 }
 }
}
class nes
{
 public static void main(String args[])
 {
 try
 {
 int a,b,c;
 DataInputStream dir=new DataInputStream(System.in);
 System.out.println("enter a:");
 a=Integer.parseInt(dir.readLine());
 System.out.println("enter b:");
 b=Integer.parseInt(dir.readLine());
 System.out.println("enter c:");
 c=Integer.parseInt(dir.readLine());
 Fun obj=new Fun();
 obj.max2(a,b,c);
 }
 catch(Exception e)
 {
 System.out.println("error"+e);
 }
 }
}




