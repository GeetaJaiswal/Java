import java.util.*;
public class InvertedHalfPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter row");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
