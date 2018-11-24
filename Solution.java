import java .util.Arrays;
public class Solution {
	public static void main(String args[]) {
		int[] a= {900, 940, 950, 1100, 1500, 1800};
		int [] b={910, 1200, 1120, 1130, 1900, 2000};
		int c=platformsNeeded(a, b);
		System.out.println(c);
	}
	public static int platformsNeeded(int arrival[], int departure[]){
		int count=1;
		Arrays.sort(arrival);
		Arrays.sort(departure);
		int i=1,j=0,max=1;
		while(i<arrival.length&&j<departure.length) {
			if(arrival[i]<departure[j]) {
				count++;
				i++;
				if(count>max) {
					max=count;
				}
			}
			else {
				count--;
				j++;
				
			}
		}
		//int count;
		return max;
	}
}
