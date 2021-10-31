import java.util.*;
public class arrayTraversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println();
		
		//foreach loop
		
		for(int i:arr) {
			System.out.println(i);
		}
	}
}
