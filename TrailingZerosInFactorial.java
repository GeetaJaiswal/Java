import java.util.*;
public class TrailingZerosInFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		
		for(int i=5;i<=n;i=i*5)
		{
			res=res+n/i;
		}
		
		System.out.println(res);
		
	}

}
