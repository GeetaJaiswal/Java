import java.util.*;
public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fname = "Tony";
		String lname = "Marks";
		
//		string concatenation
		String fullname = fname+ " " +lname;
		System.out.println(fullname);
		
//		input string from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any novel name");
		String book = sc.nextLine();
		
		System.out.println("you entered "+ book );
		
//		string length
		System.out.println(book.length());
		
		
		//accessing string characters
		for(int i =0;i<book.length();i++)
		{
			System.out.println(book.charAt(i));
		}
		
		
		//substring
		String para = "hello i am tony starks";
		System.out.println("substring is " + para.substring(0,5));
		
		
		//parseInt method
		String str = "123";
		int number = Integer.parseInt(str);
		System.out.println(number);
	}

}
