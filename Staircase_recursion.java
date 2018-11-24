
public class Staircase_recursion {
	public static void main(String[] args) {
		int a=staircase(4);
		System.out.println(a);
	}
	static int k=0;
	public static int staircase(int n) {
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
	
		k=staircase(n-1)+staircase(n-2)+staircase(n-3);
		//System.out.println(k);
		
		return k;
	}
}
