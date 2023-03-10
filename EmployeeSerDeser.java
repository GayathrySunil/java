import java.io.*;
public class EmployeeSerDeser
{
 public static void main(String[] args)
 {
 try{

 Employee e1=new Employee(32,"Gayathry",21);
 FileOutputStream fous=new FileOutputStream("EmployeeDemo.txt");
 ObjectOutputStream oos=new ObjectOutputStream(fous);
 oos.writeObject(e1);
 System.out.println("Serialized......");
 oos.flush();
 oos.close();
 }
 catch(Exception e)
 {
 System.out.println(e);
 }
 //----deserialization--------------------
 try {
 FileInputStream fis=new FileInputStream("EmployeeDemo.txt");
 ObjectInputStream ois=new ObjectInputStream(fis);

 Employee e2=(Employee)ois.readObject();
 System.out.println("Employee ID is "+e2.id);
 System.out.println("Employee Name is "+e2.name);
 System.out.println("Employee Age is "+e2.age);
 System.out.println("DeSerialized......");
 ois.close();
 } catch (Exception e) {
 System.out.println(e);

 }
 }
}