package mainpackage;
import java.util.*;

public class q5 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner (System.in);
		long n1,n2;
		System.out.println("Enter two numbers");
		n1=sc.nextInt();
		n2=sc.nextInt();
		long per,comb,a,b,c;
		a=fact(n1);
		if(n1>n2)
		{
			b=fact(n1-n2);
			c=fact(n2);
		}
		else
		{
			b=fact(n2-n1);
			c=fact(n1);
		}
		per=a/b;
				
		System.out.println("Permutation = "+per);
		
		
		comb=(a/(b*c));
		System.out.println("combinations = "+comb);
		
	}
	public static long fact(long n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n>1)
		{
			n=n*fact(n-1);
		}
		return n;
		
	}
}
