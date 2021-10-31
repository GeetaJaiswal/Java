
public class TrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, j;
		
		int arr[] = {12,34,56,78,54};
		
		for(i=1; i<=5; i++) {
			
			for(j=1; j<=i; j++) {
				
			System.out.print("*");
			}
			
			System.out.println();
		}
		

		System.out.println();
		
		for(i=5; i>=1; i--) {
			for(j=1;j<=i;j++) {
				System.out.print("*");            // inverted half pyramid
			}
			
			System.out.println();
		}
		
		
		System.out.println();
		
		//foreach loop
		
		for(int k:arr) {
			System.out.print(k + "\t");
		}
		
	}
	
	
	

}

