import java.util.*;
public class PythagorianTriplet {

	
	static boolean pythagorian(int x, int y, int z) {
		int b, c;
		int max = Math.max(x, Math.max(y, z));
		
		if(max==x) {
			b=y;
			c=z;
		}
		else if(max==y) {
			b=x;
			c=z;
		}
		else {            //(max==z)
			b=x;
			c=y;
		}	
		
		
		if(max*max == b*b + c*c) {
			return true;
		}
		else {
			return false;	
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(pythagorian(x,y,z)) {
			System.out.println("It's a Pythagorian triplet");
		}
		else {
			System.out.println("It's not a Pythagorian triplet");
		}
		
		
		
	}

}
