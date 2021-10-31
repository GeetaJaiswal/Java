import java.util.*;
public class copyArrat {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int arr1[] = {1,2,3,4,50};
////		int arr2[4];
//		int[] arr2 = new int[4];  
//		System.arraycopy(arr1, 1, arr2, 0, 4);
//		System.out.println(String.valueOf(arr2));
//	}
	public static void main(String[] args) {  
		// copy Array
        //declaring a source array  
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',  
                'i', 'n', 'a', 't', 'e', 'd' };  
        //declaring a destination array  
        char[] copyTo = new char[7];  
        //copying array using System.arraycopy() method  
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);  
        //printing the destination array  
        
        System.out.println("Copied Array");
        System.out.println(String.valueOf(copyTo));  
        
        
        int[] copyFrom1 = { 1,2,3,4,5,6,7,8,9,10 };  
        //declaring a destination array  
        int[] copyTo1 = new int[7];  
        System.arraycopy(copyFrom1, 0, copyTo1, 0, 7);  
        //printing the destination array  
        System.out.println(Arrays.toString(copyTo1));
        
        //Clone Array
        int[] From1 = { 1,2,3,4,5,6,7,8,9,10 };  
        //declaring a destination array  
        int To1[] = From1.clone();  
        
        System.out.println("Cloned Array");
        System.out.println(Arrays.toString(To1));
    }  
}
