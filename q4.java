package mainpackage;
import java.util.*;
public class q4 
{
	public static void main(String[] args) 
	{
		String str,rev="";
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string");
		str=sc.nextLine();
		int l=str.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(str.equals(rev))
		{
			System.out.println("Pallindrome");
		}
		else
		{
			System.out.println("Not pallindrome");
		}
	}
}
