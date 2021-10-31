
public class AddComplexNumbers {

	int real, complex;
	
	public AddComplexNumbers(int a, int b) {
		// TODO Auto-generated constructor stub
		this.real = a;
		this.complex = b;
	}
	
	public static void sum (AddComplexNumbers c1, AddComplexNumbers c2)
	{
		AddComplexNumbers temp = new AddComplexNumbers(0,0);
		temp.real = c1.real + c2.real;
		temp.complex = c1.complex + c2.complex;
		int sum = temp.real + temp.complex;
		System.out.println("sum of complex numbers " + temp.real + "+i" + temp.complex);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddComplexNumbers c1 = new AddComplexNumbers(2,4);
		AddComplexNumbers c2 = new AddComplexNumbers(3,5);
		sum(c1,c2);
		
	}

}
