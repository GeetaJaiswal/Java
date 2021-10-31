import java.util.*;
public class Vote {

	public static void vote(int age)
	{
		if(age>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not eligible");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int  age = sc.nextInt();
		vote(age);
	}

}
