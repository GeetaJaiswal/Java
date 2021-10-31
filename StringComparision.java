import java.util.*;
public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name1 = "Tony";
		String name2 = "Starks";
		String name3 = "Tony";
		
		int n = name1.compareTo(name2);
		System.out.println(n);
		
		if(n==0)  //name1==name2
		{
			System.out.println("Both are equal");
		}
		else if(n>0) //name1>name2  (here comparing characters)
		{
			System.out.println("first is greater than the other");
		}
		else if(n<0)  //name1<name2
		{
			System.out.println("first is less than the other");
		}
		
		if(name1.equals(name3))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Different");
		}
	}
}
 