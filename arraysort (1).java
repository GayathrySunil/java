import java.io.*;
import java.lang.*;
class arraysort
{
public static void main(String args[])
{
float a[],t;
int n,i,j;
DataInputStream dis=new DataInputStream(System.in);
try
{
System.out.println("enter the size");
n=Integer.parseInt(dis.readLine());
a= new float[n];
System.out.println("enter the elements");
for(i=0;i<n;i++)
{
a[i]=Float.parseFloat(dis.readLine());
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
t=a[i];
a[i]=a[j];
a[j]=t;
}}}
for(i=0;i<n;i++)
{
System.out.println(""+a[i]);
}
}catch(IOException e)
{
System.out.println(e);
}}
}