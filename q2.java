package mainpackage;
import java.util.*;

public class q2 
{

	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter number of elements");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.print(n1+" "+n2);
		fibo(n1,n2,n-2);
	}
	public static void fibo(int n1,int n2,int n)
	{
		if(n>0)
		{
			int n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			fibo(n1,n2,n-1);
		}
		
	}
}
