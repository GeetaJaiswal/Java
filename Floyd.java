import java.util.*;
public class Floyd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row");
		int row = sc.nextInt();
		int c = 1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{				
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}

	}

}
