package mainpackage;
import java.util.Scanner;
public class q6 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter max number of columns");
		int n;
		n=sc.nextInt();
		pattern(n);
		
	}
	static void pattern(int n)
	{
		int s = n - 1;
	     
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < s; j++)
                System.out.print(" ");
     
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
     
            System.out.print("\n");
            s--;
        }
     
        
        s= 0;
     
        for (int i = n; i > 0; i--)
        {
        
            for (int j = 0; j < s; j++)
                System.out.print(" ");
     
            for (int j = 0; j < i; j++)
                System.out.print("* ");
     
            System.out.print("\n");
            s++;
        }
	}

}
