import java.util.List;

public class max_subset_greater_number_recursion {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int m = 0;
		long k=1234;
		numberOfNumbersWithoutDuplicates(a);
		numberOfNumbersWithDuplicates(k);
		//System.out.println(m);
	}

	public static int numberOfNumbersWithoutDuplicates(int[] num) {
		int[] freq = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] fact = new int[num.length + 1];
		fact[0] = 1;
		for (int i = 0; i < num.length; i++) {
			freq[num[i]]++;
			fact[i + 1] = (i + 1) * fact[i];
		}
		return re(num, freq, fact, 0);
	}
	private static int count=0;
	private static int re(int[] num, int[] freq, int[] fact, int i) {
		if ((num.length - i) == 1 || num.length - i == 0) {
			return 0;
		}
		int k = num[i];
		for (int j = k + 1; j < 10; j++) {
			if (freq[j] > 0) {
				
				count += fact[num.length - 1-i];
			
			}
		}
		freq[k]--;
		re(num, freq, fact, i + 1);
		return count;

	}
	//----------------------------------------------------------------------------------------------------------//
	
	public static long numberOfNumbersWithDuplicates(long num){
		int n=0;
		long k=num;
		while(num!=0) {
			num=num/10;
			n++;
		}
		long [] m=new long[ n];
		while(k!=0) {
			m[n-1]=k%10;
			k=k/10;
			n--;
			System.out.println(m[n]);
		}
		return k;
	}

}
