import java.util.*;
public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for n");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
		}
		
		
//		for(;;) {
//			System.out.println("Geeta");
//		}
		
	}

}
