
public class all_indexes_recursion {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 1, 1 };
		int x = 1;
		allIndexes(a, x);
		// System.out.println(b);
	}

	public static int i = 0;
	public static int m = 0;

	public static int[] allIndexes(int input[], int x) {
		int length = check_array_size(input, x, 0);
		int[] b = new int[length];
		return first(input, 0, x, b);

	}

	public static int[] first(int input[], int len, int x, int[] b) {
		if (len == input.length) {
			return b;
		}
		if (input[len] == x) {
			b[m] = len;
			m++;
		}
		return first(input, len + 1, x, b);
	}

	public static int check_array_size(int[] input, int x, int size) {
		if (size == input.length) {
			return i;
		}
		if (input[size] == x) {
			i++;
		}
		return check_array_size(input, x, size + 1);
	}
}
