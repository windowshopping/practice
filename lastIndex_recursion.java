
public class lastIndex_recursion {
	public static void main(String[] args) {
		int[] a= {1,2,3,1};
		int x=1;
		int b=lastIndex(a, x);
		System.out.println(b);
	}
	static int i=0;
	public static int lastIndex(int input[], int x) {
		return first(input, 0,x);
	}
	public static int  first(int input[], int size, int x) {
		if(size==input.length&&i==0) {
			return -1;
		}
		if(size==input.length&&i!=0) {
			return i;
		}
		if(input[size]==x) {
			i=size;
		}
		return first(input, size+1, x);
	}
}
