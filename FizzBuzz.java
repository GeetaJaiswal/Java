
public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] sc = new String[200];
	     //int pos=0;

	        for(int i=1; i<=200; i++)
	        {
	        	if(i%3==0 && i%5==0)
	            {
	                sc[i-1]="FizzBuzz";
	            }
	            else if(i%5==0)
	            {
	                sc[i-1]="Buzz";
	            }
	            else if(i%3==0)
	            {
	                sc[i-1]="Fizz";
	            }
	            else
	            {
	                sc[i-1] = String.valueOf(i);
	            }
	        }
	        for(int i=0; i<200; i++)
	        {
	        	System.out.println(sc[i]);
	        }
	}



	}


