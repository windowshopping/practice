
public class fibonacci_recursion {
	public static void main(String[] args) {
		int x=fib(4);
		//System.out.println(x);
	}
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		System.out.println(n);
		int x=fib(n-1);
		int y=fib(n-2);
		//System.out.println(x+":"+y);
		return x+y;
	}
	
}
