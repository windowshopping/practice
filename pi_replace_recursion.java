
public class pi_replace_recursion {
	public static void main(String[] args) {
		replace("xxppip");
		System.out.println(m);
	}
	
	static String m="";
	public static String replace(String input){
		// Write your code here
		return count(input,0);
	}
	public static String count(String input,int size) {
		if(size==input.length()-1) {
			m=m+input.charAt(size);
			return m;
		}
		if(input.charAt(size)=='p'&&input.charAt(size+1)=='i') {
			m=m+"3.14";
			size++;
		}
		else {
			m=m+input.charAt(size);
		}
		
		return count(input, size+1);
	}
}
