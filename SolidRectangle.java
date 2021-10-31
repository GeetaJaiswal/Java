import java.util.*;
public class SolidRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for row and col");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		for(int i=1; i<=row; i++)
		{
			for(int j=1; j<=col; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
