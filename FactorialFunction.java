import java.util.*;
public class FactorialFunction {

	public static int fact(int n)
	{
		int fact=1;
		if(n<0)
		{
			System.out.println("invalid input");
		}
		for(int i=n;i>=1;i--)
		{
			fact = fact*i;
		}
		return fact;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = fact(n);
		System.out.println(fact);
	}

}
