import java.util.*;

public class FibonacciSeries {

	static void fibonacci(int n) {
		int t1=0;
		int t2=1;
		int nextterm;
		
		for(int i=1;i<=n;i++) {
			System.out.print(" " + t1);
			nextterm=t1+t2;
			t1=t2;
			t2=nextterm;
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibonacci(n);
	}

}
