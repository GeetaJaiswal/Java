import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int original = n;
		
//		System.out.println(String.valueOf(n).length());
		
		
		while(n>0) {
			int lastdigit = n%10;
			sum += Math.pow(lastdigit,3);
			n = n/10;
		}
		
		if(sum==original) {
			System.out.println("Armstrong number");
		}
		else {
			System.out.println("Not an armstrong number");
		}
	}


}
