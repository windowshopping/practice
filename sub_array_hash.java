import java.util.*;

public class sub_array_hash {
	public static void main(String args[]) {
		int[] a = { 7, 1, 3, 3, 0, 0 };
		boolean am = subarraySumTo0(a);
		System.out.println(am);
	}

	public static boolean subarraySumTo0(int[] input) {
		int t = 0;
		for (int i = 0; i < input.length - 1; i++) {
			t = 0;
			for (int j = i; j < input.length; j++) {
				if (input[j] != 0) {
					t = t + input[j];
					if (t == 0) {
						return true;
					}
				} else {
					break;
				}
			}
		}
		return false;
	}
}
