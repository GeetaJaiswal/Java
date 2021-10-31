
public class OddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 25;
		int num = 15;
		
		if(number%2 == 0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd Number");
		}
		
		
		 String result = (num%2==0) ? "Even" : "Odd";
		 System.out.println(result);
	}

}
