import java.util.*;
public class Multiply {

	public static int mul(int a, int b)
	{
		int mul=a*b;
		return mul;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int multiply =  mul(a,b);
		System.out.println(multiply);
	}

}
