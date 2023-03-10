import java.io.*;
class SerializationStudent
{
public static void main(String[] args)
{
try
{
Student s1=new Student(21,"Gayathry");
FileOutputStream fout=new FileOutputStream("demo.txt");
ObjectOutputStream out=new ObjectOutputStream(fout);
out.writeObject(s1);
out.flush();
out.close();
System.out.println("Serialized");
}

catch(Exception e)
{
System.out.println(e);
}
}
}