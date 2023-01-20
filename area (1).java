import java.io.*;
class cir{
	public void cir(){
		double ar,r;
			DataInputStream br =new DataInputStream(System.in);
			try{
				System.out.println("enter radius:");	
				r=Integer.parseInt(br.readLine());
				ar=r*r*3.14;
				System.out.println("area of circle:"+ar);
			}catch(Exception e){}
		}
}
class area{
	public static void main(String args[])
	{
		circle c=new circle();
		c.cir();
	}
}