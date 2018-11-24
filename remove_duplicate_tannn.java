
public class remove_duplicate_tannn {
	public static int[] repeatedNumber(final int[] A) {
		int[] a = new int[2];
		for (int i = 0; i < A.length; i++) {
			if (A[i] >= 0) {
				A[A[i]] = -A[A[i]];
			} else {
				a[0] = i;
			}
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0) {
				a[1] = i;
			}
		}
		return a;
		// System.out.println(A[i]);
	}

	public static void main(String[] args) {
		int[] a= {3, 1, 2, 5, 3};
		int[] b=repeatedNumber(a);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}
}
