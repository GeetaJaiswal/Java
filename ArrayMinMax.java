import java.util.*;
public class ArrayMinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[5];
		
		for(int i=0;i<num.length;i++)
		{
			num[i] = sc.nextInt();
		}
		
		int max = Integer.MAX_VALUE;
		int min = Integer.MIN_VALUE;
		
		for(int i=0;i<num.length;i++)
		{
			if(num[i]>max)
			{
				min = num[i];
			}
			if(num[i]<min)
			{
				max = num[i];
			}
		}
		System.out.println("minimum value is "+ min);
		System.out.println("maximum value is "+ max);
	}

}
