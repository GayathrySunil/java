import java.io.*;
class Car implements Serializable
{
 String company;
 String color;
 Engine engine;
 public Car(String company,String color,Engine engine)
 {

 this.company=company;
 this.color=color;
 this.engine=engine;
 }
 void display()
 {

 System.out.println("Company is "+company );
 System.out.println("Color is "+color );
 System.out.println("Name is "+engine.name );
 System.out.println("Model is "+engine.model );
 }
}