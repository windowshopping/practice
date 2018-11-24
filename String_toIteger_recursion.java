
public class String_toIteger_recursion {
	public static void main(String[] args) {
		convertStringToInt("1234");
	}
	static int i=0;
	
	public static int convertStringToInt(String input){
		// Write your code here
		return m(input,0);
	}
	private static int m(String input,int size) {
		if(size==input.length()) {
			return i;
		}
		i=i*10+Character.getNumericValue(input.charAt(size));
		//System.out.println(i);
		return m(input, size+1);
	}
}
