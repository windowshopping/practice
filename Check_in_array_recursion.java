
public class Check_in_array_recursion {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int x=5;
		boolean m=checkNumber(a, x);
		System.out.println(m);
	}
	public static boolean checkNumber(int input[], int x) {		
		return check(input,x,0);     
	}
	public static boolean check(int[] input,int x,int size) {
		if(size==input.length) {
			return false;
		}
		if(input[size]==x) {
			return true;
		}
		
		return check(input, x, size+1);
	}
}
