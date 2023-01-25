import java.io.*;
import java.lang.*;
class Minimum
{
public static void main(String args[])
{
 int x,y,z,temp;
 String s;
try{
 DataInputStream din=new DataInputStream(System.in);
 System.out.println("enter x");
 s=din.readLine();
 x=Integer.parseInt(s);
 System.out.println("enter y");
 s=din.readLine();
 y=Integer.parseInt(s);
 System.out.println("enter z");
 s=din.readLine();
 z=Integer.parseInt(s);
 if(y<z)
 {
 temp=((x<y)&&(x<z))?x:y;
 System.out.println(temp+"is min");
 }else
 {
 System.out.println(z+"is min");
 }
}
catch(Exception e)
{
 System.out.println(e+"error");
}
}
}