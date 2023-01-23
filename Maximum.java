import java.io.*;
import java.lang.*;
 class  Maximum
{
   public static void main(String args[])
 {
String str,str1,str2;
int num1,num2,num3;

DataInputStream dis=new DataInputStream(System.in);
try
{
System.out.println("enter the first no");
str=dis.readLine();
num1=Integer.parseInt(str);
System.out.println("enter the second no");
str1=dis.readLine();
num2=Integer.parseInt(str1);
System.out.println("enter the third no");
str2=dis.readLine();
num3=Integer.parseInt(str2);
      if (num1 >= num2 && num1 >= num3)
         System.out.println( num1 + " is the maximum number.");
      else if (num2 >= num1 && num2 >= num3)
         System.out.println( num2 + " is the maximum number.");
      else
         System.out.println( num3 + " is the maximum number.");
   }catch(IOException e)
{
System.out.println(e);
}}
}