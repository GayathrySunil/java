//Create an interface Shape having two prototypes disp() and calc(), to diplay the shape and calculate volume respectively. Create two classes circle and rectangle which implements the above interface. In the main function create a reference of Shape depending on the user-choice.

import java.io.*;
import java.lang.*;
interface shape
{
 public void disp();
 public void calc();
}
class Circle implements shape
{
 public void disp()
 {
 System.out.println("The shape is circle");
 }
 public void calc()
 {
 try
 {
 DataInputStream dir=new DataInputStream(System.in);
 System.out.println("enter the radius:");
 Double r=Double.parseDouble(dir.readLine());
 Double a=3.14*r*r;
 System.out.println("output="+a);
 }
 catch(Exception e)
 {System.out.println("error"+e);}
 }
}
class Rectangle implements shape
{
public void disp()
{
System.out.println("The Shape is rectangle");
}
public void calc()
{
 try
 {
 DataInputStream dir=new DataInputStream(System.in);
 System.out.println("enter the length:");
 Double l=Double.parseDouble(dir.readLine());
 System.out.println("enter the b:");
 Double b=Double.parseDouble(dir.readLine());
 Double a=l*b;
 System.out.println("output="+a);
 }
 catch(IOException e)
 {
 System.out.println(e);
 }
 }
}
class cirrect
{
public static void main(String args[])
{
 try
 {
 int ch=1,c;
 Circle obj=new Circle();
 Rectangle obj1=new Rectangle();
 DataInputStream dir=new DataInputStream(System.in);
 do
 {
 System.out.println("1.area of circle\n2.area of rectangle\n");
 c=Integer.parseInt(dir.readLine());
 switch(c)
 {
 case 1:obj.disp();
 obj.calc();
 break;
 case 2:obj1.disp();
 obj1.calc();
 break;
 }
 System.out.println("do you want to continue(1/0):");
 ch=Integer.parseInt(dir.readLine());
 }while(ch==1);
 }catch(IOException e)
{System.out.println(e);}
 }
}
 
