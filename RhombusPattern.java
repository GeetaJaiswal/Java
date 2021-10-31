import java.util.*;
public class RhombusPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
		for(int j=1;j<=n-i;j++) {
			System.out.print(" ");
		}
		
		for(int z=1; z<=n;z++) {
			System.out.print("*");
		}
		System.out.println();
		}
		
		
	}

}
