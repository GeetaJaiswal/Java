import java.util.*;
public class DecimalToBinary {

	static int toBinary(int decimal) {
		int index = 0;
//		int a = String.valueOf(decimal).length();
		int arr[] = new int[10];
		
		while(decimal>0) {
			arr[index] = decimal%2;
			index++;
			decimal = decimal/2;
		}
		for(int i=index-1; i>=0; i++) {
			System.out.println(arr[i]);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		
		System.out.println(toBinary(decimal));
		
	}

}
