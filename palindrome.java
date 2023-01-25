import java.io.*;
class palindrome
{
    public void rev(int n){
	int t=n,d=0,r;
	while(n>0){
		r=n%10;
		d=d*10+r;
		n=n/10;
	}
	int temp=pal(t,d);
	if(temp==1){
		System.out.println(t+" is a palindrome number");
	 }
	 else{
		System.out.println(t+" is not a palindrome number"); 
	 }
	}
	public int pal(int t,int d){
		if(d==t){
			return 1;
		}
		else
			return 0;
	}		
}

class palindrome
{
		public static void main(String args[])
	{
		int n;
		palind p =new palind();
		DataInputStream br=new DataInputStream(System.in);
		try{
			System.out.println("enter an number:");
			n=Integer.parseInt(br.readLine());
			p.rev(n);
		}catch(Exception e){}
	}
}