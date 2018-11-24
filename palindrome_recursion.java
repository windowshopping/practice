
public class palindrome_recursion {
	public static void main(String[] args) {
		String a = "thissihm";
		boolean ans = isStringPalindrome(a);
		System.out.println(ans);
	}

	static int i = 0;

	public static boolean isStringPalindrome(String input) {
		
			return odd(input, 0, input.length() - 1);
		
	}

	public static boolean odd(String input, int start, int end) {
		if (input.length() == 0) {
			return false;
		}
		if (start > end) {
			return true;
		}
		if (input.charAt(start) != input.charAt(end)) {
			return false;
		}
		return odd(input, start + 1, end - 1);
	}

	
}
