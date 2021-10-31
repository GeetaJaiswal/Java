
public class StringBufferExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Hello Everyone");
		System.out.println(sb);
		
		
//		getting character
		
		for(int i=0;i<sb.length();i++)
		{
			System.out.println(sb.charAt(i));
		}
		
		
//		set character at any index (for replacement)
		sb.setCharAt(3, 'o');
		System.out.println(sb);
		
		
//		insert character at any index
		sb.insert(3, 'l');
		System.out.println(sb);
		
//		delete character from any index
		sb.delete(5, 6);
		System.out.println(sb);
		
		//append string/char at last
		sb.append(", Welcome to Java Programming");
		System.out.println(sb);
		
		//getting length of string
		System.out.println(sb.length());
		
	}

}
