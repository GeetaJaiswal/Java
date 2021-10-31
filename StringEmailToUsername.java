import java.util.*;
public class StringEmailToUsername {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter email");
		String email = sc.next();
		String username = "";
		
		for(int i=0;i<email.length();i++)
		{
			if(email.charAt(i) == '@')
			{
				break;
			}
			else
			{
				username+=email.charAt(i);
			}
		}
			System.out.println("your username is "+ username);
	}

}
