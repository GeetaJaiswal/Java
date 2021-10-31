import java.util.*;

public class Primes {
   
	static void  checkNum (int num1, int num2) {
	   int i,j;
	   for (i = num1; i <= num2; i++) {
		   for(j=2; j<=i;j++) {
			   if(i%j==0) {
				   break;
			   }  
		   }
		   if(i==j) {
			   System.out.println(j);
		   } 
	   }	   
	}
	
   
   public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int num1=in.nextInt();
	int num2=in.nextInt();
	checkNum(num1, num2);
	} 
}

