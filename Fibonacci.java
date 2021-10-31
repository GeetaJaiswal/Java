import java.util.*;
public class Fibonacci {

	public static void fibonacci(int a, int b, int n)
	{
		while(n>0)
		{
			int temp = a+b;
			a=b;
			b=temp;
			n--;
			System.out.println(temp);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		fibonacci(a,b,n);
	}

}
