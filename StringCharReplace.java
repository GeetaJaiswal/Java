import java.util.*;
public class StringCharReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String name = sc.nextLine();
		String result = ""; 
		
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i) == 'e')
			{
				result+="i";
			}
			else
			{
				result+=name.charAt(i);
			}
		}
		
		System.out.println(result);
	}

}
