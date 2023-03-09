class Thread1 extends Thread
{
    public void run()
    {
        System.out.println("Thread1 is running");
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        System.out.println("Thread2 is running");
    }
}
class Thread3 extends Thread
{
    public void run()
    {
        System.out.println("Thread3 is running");
    }
}
class ThreadClass
{
    public static void main(String[] args)
    {
        Thread1 t1=new Thread1();
        Thread2 t2=new Thread2();
        Thread3 t3=new Thread3();
        t1.start();
        t2.start();
        t3.start();
    }
}
