
public class Sum_of_Array_recursion {
	static int i=0;
	public static void main(String[] args) {
		int [] a= {1,2,3,4,10};
		Sum_of_Array_recursion obj=new Sum_of_Array_recursion();
		int m=sum(a);
		System.out.println(m);
	}
	public static int sum(int[] input) {
		int a=sum1_1(input,0);
		return a;
	}
	public static int sum1_1(int[] input,int size) {
		if(size==input.length) {
			return 0;
		}
		i=i+input[size];
		sum1_1(input,size+1);
		return i;
	}
}
