package mainpackage;
import java.util.*;
public class q7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String str,rev="";
		System.out.println("Enter the string");
		str=sc.nextLine();
		int l=str.length();
		for(int i=l-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println("Reversed string = "+reverse);
	}

}
