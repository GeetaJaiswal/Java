import java.util.*;

public class PascalTriangle {
	
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
		int n = sc.nextInt();
		
		for(int i=0;i<=n ;i++) {
			for(int j=0;j<=i;j++) {
				int cal = fact(i)/(fact(i-j)*fact(j));
				System.out.print(cal + " ");
			}
			System.out.println();
		}

	}

}
