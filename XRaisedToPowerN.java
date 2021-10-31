import java.util.*;
public class XRaisedToPowerN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter x");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("Enter n");
		int n = sc.nextInt();
		
		int res=1;
		for(int i=1;i<=n;i++)
		{
			res=res*x;
		}
		System.out.println(res);
	}

}
