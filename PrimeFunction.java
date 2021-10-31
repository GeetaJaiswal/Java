import java.util.*;
public class PrimeFunction {

	public static int prime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}			
		return count;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = prime(n);
		if(count==2) {
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not a prime number");
		}
	}

}
