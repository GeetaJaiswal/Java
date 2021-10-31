import java.util.*;
public class AscendingDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		boolean isAscending = true;
		int a[] = new int[5];
		
		System.out.println("Enter values");
		
		for(int i=0;i<a.length;i++)
		{
			a[i] = sc.nextInt();
		}
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]>a[i+1])
			{
				isAscending = false;
			}
		}
		
		if(isAscending)
		{
			System.out.println("Ascending Order");
		}
		else
		{
			System.out.println("Descending Order");
		}
	}

}
