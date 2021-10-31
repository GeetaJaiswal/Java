import java.util.*;

public class Ncr_Calculation {

	static int fact(int f) {
		int mul=1;
		for(int i=f; i>=1; i--) {
			mul *= i;
		}
		return mul;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for n, and r");
		
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int cal = fact(n)/(fact(n-r)*fact(r));
		System.out.println(cal);
		
	}

}
