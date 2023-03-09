import java.io.*;
import java.util.Scanner;
class SearchDirc
{
public static void main(String[] args)
{
System.out.println("Enter path of directory");
Scanner sc=new Scanner(System.in);
String folder_path=sc.next();
File folder=new File(folder_path);
if(folder.exists())
{
System.out.println("Enter file path");

String file_path=sc.next();
File filename=new File(file_path);
if(filename.exists())
{
System.out.println("file found");
}
else{
System.out.println("file not found");
}
}
else
{

System.out.println("Directory not found");
}
}
}