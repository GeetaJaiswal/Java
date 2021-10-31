import java.util.Scanner;
public class SolidRhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter row");
		Scanner sc =  new Scanner(System.in);
		int row = sc.nextInt();
		
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i-2+1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=row; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
