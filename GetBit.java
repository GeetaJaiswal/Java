import java.util.*;
public class GetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Enter position");
		int pos = sc.nextInt();
		
		int bitMask = 1<<(pos);
		
		if((bitMask & n) == 0)
		{
			System.out.println(pos + "bit is: "+  0);
		}
		else
		{
			System.out.println(pos + " position bit is: "+  1);
		}
		
	}

}
