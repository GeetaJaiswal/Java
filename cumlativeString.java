import java.util.*;

	public class cumlativeString {
		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("size of array");
		int s = sc.nextInt();
		String name[] = new String[s];
		int l = 0;
		
		System.out.println("enter strings");
		
		for(int i=0;i<s;i++)
		{
			name[i] = sc.next();
			l += name[i].length();
		}
		
		for(int i=0;i<s;i++)
		{
			System.out.println(name[i]);
		}
		System.out.println("total cumalative length of string is "+l);
		
	}

}
