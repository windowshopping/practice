import java.util.*;
public class test_1 {
	public static void main(String[] args) {
		int[] a= {30, 20, 53, 14};
		int b= maximumProfit(a);
		System.out.println(b);
	}
	public static int maximumProfit(int budget[]) {
		int max=0,current_price=0;
		Arrays.sort(budget);
		for(int i=0;i<budget.length;i++) {
			int sum=budget.length-i;
			current_price=sum*budget[i];
		
			if(max<=current_price) {
				max=current_price;
				//System.out.println(current_price);
			}
		}
		return max;
	}
}
