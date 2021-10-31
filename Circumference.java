import java.util.*;
public class Circumference {

	public static void circum(int r)
	{
		float pi = (float) 3.14;
		float c = 2*pi*r;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		circum(r);
	}

}
