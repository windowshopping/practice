
public class sum_of_digits_recursive {
	public static void main(String[] args) {
		int k=1234;
		int i=sumOfDigits(k);
		System.out.println(i);
	}
	static int i=0;
	static int m=0;
	public static int sumOfDigits(int input){
		// Write your code here
		if(input==0&&m==0) {
			return 0;
		}
		m=1;
		if(input==0&&m==1) {
			return i;
		}
		i+=input%10;
		return sumOfDigits(input/10);
	}
}
