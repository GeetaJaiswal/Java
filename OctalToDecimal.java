import java.util.*;
public class OctalToDecimal {

	static int decimal(int octal) {
		
		int sum=0;
		int n;
		int x=1;
//		while(octal>0) {
//			n = octal%10;
//			sum = (int) (sum+(n*(Math.pow(8,x))));          // in this case initially x would be intialize as equal to 0
//			x++;
//			octal /= 10;
//		}
//		
		while(octal>0) {
			n = octal%10;
			sum += x*n;
			x *= 8;
			octal /= 10;
		}
		return sum;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int octal = sc.nextInt();
		
		System.out.println(decimal(octal));
	}

}
