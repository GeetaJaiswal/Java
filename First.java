import java.util.*;
public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter two integers and any number between 1 to 5 to perform operation");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int operation = sc.nextInt();
		
		switch(operation) {
		case 1:
			int add = a+b;
			System.out.println(add);
			break;
		case 2:
			int sub = a-b;
			System.out.println(sub);
			break;
		case 3:
			int mul = a*b;
			System.out.println(mul);
			break;
		case 4:
			int div = a/b;
			System.out.println(div);
			break;
		case 5:
			int mod = a%b;
			System.out.println(mod);
			break;
		default :
			System.out.println("invalid");
				
		}

	}

}
