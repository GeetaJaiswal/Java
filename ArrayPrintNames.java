import java.util.*;
public class ArrayPrintNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String names[] = new String[5];
		
		for(int i=0;i<names.length;i++)
		{
			names[i] =  sc.next();
		}
		
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
	}

}
