import java.util.Scanner;
public class HexaToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String hexa = sc.nextLine();
		
		int x=1;
		int sum=0;
		int s = hexa.length();
		
		for(int i=s-1; i>=0; i--) {
			if(hexa.charAt(i)>='0' && hexa.charAt(i)<='9') {
				sum += x*(hexa.charAt(i)-'0');
			}
			else if(hexa.charAt(i)>='A' && hexa.charAt(i)<='F') {
				sum += x*(hexa.charAt(i)-'A'+10);
			}
			x*=16;
		}
		System.out.println(sum);
	}

}
