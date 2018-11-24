//wrong ans
import java.util.*;
public class Long_consec_sub {
	public static void main(String args[]) {
		int [] a= {1,2,3,4,5,7,8};
	
		longestSubsequence(a);
	}
	
	public static ArrayList<Integer> longestSubsequence(int[] arr){
		// Write your code here
		ArrayList<Integer> a=new ArrayList<>();
		Arrays.sort(arr);
		
		int prev=arr[0],start=0,last=0,max=0,x=0;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=prev+1) {
				if(max<last-start) {
					max=last-start;
					x=start;
				}
				start=i;
				prev=arr[i];
			}
			
			else if(arr[i]==prev+1||arr[i]==prev) {
				last =i;//System.out.println(last);
				//System.out.println(prev+":"+arr[i]);
				prev=arr[i];
			}
		}
		//System.out.print(start);
		if(last==arr.length-1&&x==0&&max==0) {
			max=arr.length-1;
			for(int i=start;i<=max;i++) {
				System.out.println(arr[i]);
				a.add(arr[i]);
			}
		}
		else {
		for(int i=x;i<=x+max;i++) {
			System.out.println(arr[i]);
			a.add(arr[i]);
		}
		}
		return a;
	}
}
