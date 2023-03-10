import java.util.*;

class AverageDemo
{
    public static void main (String args[])
        {
            Integer integerNumbers[] = {1, 2, 3, 4, 5};
            Average<Integer> integerObject = new Average<Integer>(integerNumbers);
            double i_average = integerObject.getAverage();
            System.out.println("The average value of given integers is : " + i_average);
            Float floatNumbers[] = {1.2f, 3.6f, 4.7f, 8.5f};
            Average<Float> floatObject = new Average<Float>(floatNumbers);
            double f_average = floatObject.getAverage();
            System.out.println("The average value of given integers is : " + f_average);
            Double doubleNumbers[] = {3.25, 5.68, 1.27, 7.94};
            Average<Double> doubleObject = new Average<Double>(doubleNumbers);
            double d_average = doubleObject.getAverage();
            System.out.println("The average value of given integers is : " + d_average);
        }
}

class Average<T extends Number>
{ 
  T[] numbers;
  public Average(T[] numbers) 
  {          
    this.numbers = numbers;
  }
  double getAverage()
  {        
    double sum = 0.0;          
    for(int i = 0; i< numbers.length; i++)
    {
      sum += numbers[i].doubleValue();
    } 
    return sum / numbers.length;
  }
}