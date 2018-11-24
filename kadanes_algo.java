
public class kadanes_algo {
	public static void main(String[] args) {
		int [] a= {-2,1,-3,4,-1,2,1,-5,4};
		int m=max_contiguous(a);
		System.out.println(m);
	}
	private static int max_contiguous(int [] a) {
		int max=a[0],b=a[0];
		for(int i=1;i<a.length;i++) {
			b=Math.max(a[i],b+a[i]);
			max=Math.max(b, max);
		}
		return max;
	}
}
