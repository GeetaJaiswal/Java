import java.util.*;
public class PallindromicPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			int j=1;
			for(j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			
			int k=i;
			for(; j<=n; j++) {
				System.out.print(k--);
			}
			
			k=2;
			for(; j<=n+i-1;j++) {
				System.out.print(k++);
			}
			System.out.println();
		}
	}

}
