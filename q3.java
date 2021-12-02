package mainpackage;
import java.util.*;
public class q3 
{

	public static void main(String[] args) 
	{
		int num,ans;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an integer");
		num=sc.nextInt();
		ans=fact(num);
		System.out.println("Fact = "+ans);
	}
	public static int fact(int x)
	{
		if(x>1)
		{
			x = x *fact(x-1);
		}
		return x;
		
	}

}
