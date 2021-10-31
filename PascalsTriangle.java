import java.util.Scanner;
public class PascalsTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int coef=1;
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<=row-i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++)
			{
				if(i==0 || j==0)
				{
					coef=1;
				}
				else
				{
					coef =  coef*(i-j+1)/j;
				}
				System.out.print(coef+" ");
			}
			System.out.println(); 
		}
	}

}
