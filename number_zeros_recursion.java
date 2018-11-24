
public class number_zeros_recursion {
	public static void main(String[] args) {
		int a= 102000400;
		int b=countZerosRec(a);
		System.out.println(b);
	}
	static int i=0;
	public static int countZerosRec(int input){
		if(input==0) {
			return i;
		}
		if(input%10==0) {
			i++;
		}
		return countZerosRec(input/10);
	}
	
}
