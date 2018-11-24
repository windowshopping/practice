
public class Find_Index_of_Number_recursion {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int x=10;
		int b=firstIndex(a, x);
		System.out.println(b);
	}
	public static int firstIndex(int input[], int x) {
		return first(input, 0,x);
	}
	public static int  first(int input[], int size, int x) {
		if(size==input.length) {
			return -1;
		}
		if(input[size]==x) {
			return size;
		}
		return first(input, size+1, x);
	}
}
