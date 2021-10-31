import java.util.*;
public class InvertedHalPyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row =  sc.nextInt();
		int count=1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=i;j<=row;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
