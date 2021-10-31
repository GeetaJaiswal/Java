import java.util.*;

public class InputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter two numbers");
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a+b;
		
		System.out.println("sum is \n" + sum);
		
		
		System.out.println("Enter another integer number");
		
		boolean check = sc.hasNextInt();
		System.out.println(check);
		
		System.out.println("Enter a string");
		 
		String s = sc.nextLine();
		System.out.println("You entered \t" + s);
	}

}
