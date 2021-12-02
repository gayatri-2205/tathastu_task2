package mainpackage;
import java.util.Scanner;
import java.util.*;
class q1
{
	public static void main(String []args) 
	{
		int ch,m;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for subtraction");
		System.out.println("Enter 3 for multiplication");
		System.out.println("Enter 4 for division");
		System.out.println("Enter 0 to exit");
		
		while(true)
		{
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			if(ch == 0)
			{
				break;
			}
			switch(ch)
			{
				case 1:Addition();
					break;
				case 2:Subtraction();
					break;
				case 3: Multiplication();
					break;
				case 4:Division();
					break;
				default:System.out.println("Invalid choice");
			}
		}
	}
	public static void Addition()
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int ans=num1+num2;
		System.out.println("Addition = "+ans);
	}
	public static void Subtraction()
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int ans=num1-num2;
		System.out.println("Subtraction = "+ans);
	}
	public static void Multiplication()
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int ans=num1*num2;
		System.out.println("Multiplication = "+ans);
	}
	public static void Division()
	{
		int num1,num2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		int ans=num1/num2;
		System.out.println("Division = "+ans);
	}
}
