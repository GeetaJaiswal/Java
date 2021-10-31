import java.util.*;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int flag=0;
		
		for(int i=2; i<n; i++) {
			if(n%i==0) {
				flag=1;;
//				System.out.println(count);
			}
		}
		
		if(flag==0) {
			System.out.println("Prime number");
		}
		
		else {
			System.out.println("Not prime number");
		}
	}

}
