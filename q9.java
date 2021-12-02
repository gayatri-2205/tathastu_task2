package mainpackage;
import java.util.*;

public class q9 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		
		System.out.println("Array before deleting an element");
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("Deleting an element");
		a.remove(1);
        System.out.println("Array after deleting an element");
		
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
	
	}
	
	

}
