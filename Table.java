import java.util.*;
public class Table {

	
	public static void table(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n*i);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		table(n);
	}

}
