import java.io.*;
class DeserializationStudent
{
public static void main(String[] args)
{
try
{
FileInputStream fis=new FileInputStream("demo.txt");
ObjectInputStream ois=new ObjectInputStream(fis);
Student s=(Student)ois.readObject();
System.out.println("Name is "+ s.name+" and id is "+s.id);
ois.close();
}
catch(Exception e)
{
System.out.println(e);
}


}
}