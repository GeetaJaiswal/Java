import java.util.*;
public class ArrayLinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter size");
		int s = sc.nextInt();
		
		int a[] = new int[s];
		
		System.out.println("Enter numbers");
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		System.out.println("enter number for search");
		int search = sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				System.out.println("number found at index " + i);
			}
		}
	}

}
