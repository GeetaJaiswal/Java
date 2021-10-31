import java.util.*;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		StringBuffer name = new StringBuffer("");	
		StringBuffer temp = new StringBuffer("");	
		System.out.println("Enter any name");
		name.append(sc.nextLine());
		
		System.out.println(name);
		
		for(int i=name.length()-1;i>=0;i--)
		{
			temp.append(name.charAt(i));
		}
		System.out.println(temp);
	}	

}
