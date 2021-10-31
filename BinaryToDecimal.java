import java.util.*;
public class BinaryToDecimal {

	static int binaryToDecimal(int binary) {
		int x=1;
		int sum=0;
		int n;
		
		while(binary > 0) {
		 n = binary%10;
		 sum += x*n;
		 x *= 2;
		 binary /= 10;
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int binary = sc.nextInt();
		
		System.out.println(binaryToDecimal(binary));
	}

}
