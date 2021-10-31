import java.util.*;
public class HollowButterfly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter row");
		Scanner sc =  new Scanner(System.in);
		int row = sc.nextInt();
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1; j<=2; j++)
			{
				System.out.print("*");
			}
			for(int j=1;j<=2*(i-1);j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=2; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
