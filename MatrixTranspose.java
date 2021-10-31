import java.util.*;
public class MatrixTranspose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter rows and cols");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int num[][] = new int[rows][cols];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<cols; j++)
			{
				num[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Transpose of matrix is:");
		
		for(int i=0; i<cols; i++)
		{
			for(int j=0; j<rows; j++)
			{
				 System.out.print(num[j][i] + " ");
			}
			System.out.println();
		}
	}

}
