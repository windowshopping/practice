
public class mul_with_only_subs_add_recursion {
	public static void main(String[] args) {
		int m = 2, n = 7;
		int b=multiplyTwoIntegers(m, n);
		System.out.println(b);
		
	}
	static int f=0;
	static int i=0;
	public static int multiplyTwoIntegers(int m, int n) {
		// Write your code here
		if (m > n) {
			return m_mul_n(m, n);
		} else {
			return m_mul_n(n, m);
		}
	}

	public static int m_mul_n(int m, int n) {
		if((m==0||n==0)&&f==0) {
			return 0;
		}
		f=1;
		if(n==0&&f==1) {
			return i;
		}
		i=i+m;
		return m_mul_n(m, n-1);
	}

}
