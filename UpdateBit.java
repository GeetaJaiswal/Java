import java.util.Scanner;
public class UpdateBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Enter position");
		int pos = sc.nextInt();
		System.out.println("Press 1 to update 0 to 1 or Press 0 to update 1 to 0");
		int operation = sc.nextInt();
		
		int bitMask = 1<<(pos);
		int ans;

		if(operation==0)
		{
			int notMask = ~(bitMask);
			ans = notMask & n;
		}
		else
		{
			ans = bitMask | n;
		}
		
		System.out.println(Integer.toBinaryString(ans));
	}
}
