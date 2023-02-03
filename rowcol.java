import java.io.*;
class rowcol
{
public static void main(String args[])
{
	DataInputStream br =new DataInputStream(System.in);
	int a[][],m,n,i,j,sumrow=0,sumcol=0;
	try{
		System.out.println("enter row and column:");
		m =Integer.parseInt(br.readLine());
		n =Integer.parseInt(br.readLine());
		a=new int[m][n];
		System.out.println("enter elements:");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				a[i][j]=Integer.parseInt(br.readLine());
			}
		}
		System.out.println("elements:");
		for(i=0;i<m;i++){
			for(j=0;j<n;j++){
				System.out.println(a[i][j]);
			}
		}
		for(i=0;i<m;i++){
			sumrow=0;
			for(j=0;j<n;j++){
				sumrow+=a[i][j];
			}
			System.out.println(" row "+(i+1)+" sum:"+sumrow);
		}
		for(i=0;i<n;i++){
			sumcol=0;
			for(j=0;j<m;j++){
				sumcol+=a[j][i];
			}
			System.out.println("column "+(i+1)+" sum:"+sumcol);
		}
	}catch(Exception e){}
}
}