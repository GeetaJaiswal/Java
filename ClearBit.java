import java.util.Scanner;
public class ClearBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Enter position");
		int pos = sc.nextInt();
		
		int bitMask = 1<<(pos);
		int notMask = ~(bitMask);
		
		int ans = notMask & n;
		System.out.println(Integer.toBinaryString(ans));
	}
}
