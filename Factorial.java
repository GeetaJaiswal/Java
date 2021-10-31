import java.util.*;
public class Factorial {

	static void factorial(int n) {
		int mul=1;
		for(int i=n; i>=1; i--) {
			mul *= i;
		}
		System.out.println(mul);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanne r(System.in);
		int n = sc.nextInt();
		factorial(n);
	}

}
