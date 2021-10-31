import java.util.*;
public class OddSum {
	
	
	public static void odd(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		odd(n);
	}

}
