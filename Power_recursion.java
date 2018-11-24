
public class Power_recursion {
	public static void main(String[] args) {
		int x=3,n=4;
		int a=power(x, n);
		System.out.println(a);
	}
	public static int power(int x, int n) {
		if(n==1) {
			return x;
		}
		int m=power(x, n-1);
		return x*m;
	}
}
