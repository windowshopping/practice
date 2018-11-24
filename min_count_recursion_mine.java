
public class min_count_recursion_mine {
	public static void main(String[] args) {
		minCount(6,0);
		System.out.println(a);
	}

	static int a = 0;
	public static void minCount(int n,int na) {
		if (n < 1) {
			return;
		}
		if(n==1) {
			a++;
			return;
		}
		
		int k = (int) Math.sqrt(n);
		a++;
		minCount(n - k * k,0);
		
	}
}
