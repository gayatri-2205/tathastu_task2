package mainpackage;
import java.util.*;
public class q8 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		int n;
		System.out.println("Enter the size of array");
		n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter your array");
		int i;
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		if(ismirrorinverse(arr))
		{
			System.out.println("Mirror Inverse");
			
		}
		else
		{
			System.out.println("Not a mirror inverse");
		}
	}
	static boolean ismirrorinverse(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[arr[i]]!=i)
			{
				return false;
			}
		}
		return true;
		
	}
}
