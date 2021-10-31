import java.util.*;
public class Zero1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter row");
		Scanner sc =  new Scanner(System.in);
		int row = sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print("0"
							+ "");
				}
			}
			System.out.println();
		}
	}

}
