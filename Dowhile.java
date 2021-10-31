import java.util.*;
public class Dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter marks out of 100");
			int mark =  sc.nextInt();
			if(mark>=90) {
				System.out.println("This is good");
			}
			else if(mark>=60 && mark<=89) {
				System.out.println("This is also good");
			}
			else if(mark>=0 && mark<=59) {
				System.out.println("This is good as well");
			}
			else {
				System.out.println("invalid");
			}
		System.out.println("Want to continue ? (yes(1) or no(0))");
		input = sc.nextInt();
		} while(input == 1);

	}
}
