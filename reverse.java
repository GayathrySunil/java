import java.io.*;
class reverse
{
    public void rev(int n){
	int d=0,r;
	while(n>0){
		r=n%10;
		d=d*10+r;
		n=n/10;
	}
	System.out.println("reversed number:"+d);
	}	
}

class reverse
{
		public static void main(String args[])
	{
		int n;
		reve re =new reve();
		DataInputStream br=new DataInputStream(System.in);
		try{
			System.out.println("enter an number:");
			n=Integer.parseInt(br.readLine());
			re.rev(n);
		}catch(Exception e){}
	}
}