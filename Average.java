import java.util.*;
public class Average {

	public static void average(int a, int b)
	{
		int sum=a+b;
		int avg = sum/2;
		System.out.println(avg);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		average(a,b);
	}

}
