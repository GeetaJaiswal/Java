import java.util.*;
public class TwoDArraySearchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row and col");
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		int num[][] = new int[row][col]; 
		
		System.out.println("Enter values");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				num[i][j] = sc.nextInt(); 
			}
		}
		
		System.out.println("Enter number to search");
		int s = sc.nextInt();
		
		
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				if(num[i][j] == s)
				{
					System.out.println("FOund at position ("+ i +" , "+ j + ")");
				}
				 
			}
		}
	}

}
