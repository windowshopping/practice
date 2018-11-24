
public class MIN_COUNT_RECURSION {
	public static void main(String[] args) {
		int b = minCount(15);
		//System.out.println(b);
	}

	public static int minCount(int n) {
		if (n <= 1) {//System.out.println("n<=1");
			return n;
		}
		int ans = n;System.out.println(ans);
		for (int i = 1; i <= n; i++) {
			int square = i * i;
			//System.out.println(i+"i:n"+n);
			if (square > n) {//System.out.println("break:"+n);
				break;
			}
			System.out.println("h:"+ans);
			ans = Math.min(ans, minCount(n - square) + 1);
			System.out.println("here:"+ans);
		}
		return ans;
	}
}
